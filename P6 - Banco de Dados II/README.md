### Banco de Dados II - Trigger para salvar uma tupla deletada

#### Sobre o banco

Consiste em um sistema de criação de designs (como o Canva), quando um usuário deleta um design o trigger enviará as informações dele para a lixeira, permanecendo lá por 30 dias. Esse banco se baseia em backups das informações, não removendo com integridade os dados de uma vez só.

![Diagrama ER](/P6%20-%20Banco%20de%20Dados%20II/)


#### Criação do banco

Exemplo com a tabela design:
```sql
CREATE TABLE Design (
  designID     SERIAL PRIMARY KEY,
  name          varchar(255) NOT NULL, 
  resolution    varchar(255) NOT NULL,
  type          varchar(255) NOT NULL,
  create_date   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```


#### Inserindo dados

Exemplo na tabela Users:
```sql
INSERT INTO Users (name, email, phone, password, create_date) 
VALUES ('João Silva', 'joao.silva@email.com', '11987654321', 'senha123', '2023-08-01 12:00:00');
```


#### Trigger

Função:
```sql
CREATE OR REPLACE FUNCTION move_to_trash() RETURNS TRIGGER AS $$
BEGIN
  INSERT INTO Lixeira (IDUsuarioFK, IDDesignFK, status_owner, delete_date)
  VALUES (OLD.IdUserFK, OLD.IdDesignFK, OLD.status_owner, CURRENT_TIMESTAMP);

  RETURN NULL;
END;
$$ LANGUAGE plpgsql;
```

Trigger:
```sql
CREATE TRIGGER after_design_delete 
AFTER DELETE ON User_Design
FOR EACH ROW
EXECUTE FUNCTION move_to_trash();
```

#### Testando triggers

```sql

```

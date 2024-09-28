## Banco de Dados II - Trigger para salvar uma tupla deletada

### Sobre o banco

Consiste em um sistema de criação de designs (como o Canva). Quando um usuário deleta um design, o trigger enviará as informações dele para a lixeira, permanecendo lá por *algum tempo*. Esse banco se baseia em backups das informações, não removendo os dados definitivamente quando solicitado pelo usuário.

![Diagrama ER](/P6%20-%20Banco%20de%20Dados%20II/projeto-trigger/bd2.png)

### Código completo [montagem.sql](/P6%20-%20Banco%20de%20Dados%20II/Trigger/montagem.sql)

### Criação do banco

Exemplo com a tabela design:
```sql
CREATE TABLE Design (
  IdDesign SERIAL PRIMARY KEY,
  date_create TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  nome varchar(255) NOT NULL, 
  resolution varchar (30) NOT NULL,
  tipo varchar (50) NOT NULL 
);
```


### Inserindo dados

Exemplo na tabela Users:
```sql
INSERT INTO Users (nome, email, telefone, senha, create_date) 
VALUES ('João Silva', 'joao.silva@email.com', '11987654321', 'senha123', '2023-08-01 12:00:00');
```


### Trigger

Função:
```sql
CREATE OR REPLACE FUNCTION move_to_trash() RETURNS TRIGGER AS $$
BEGIN
  INSERT INTO Lixeira (IDUsuarioFK, IDDesignFK, status_owner, delete_date)
  VALUES (OLD.IdUserFK, OLD.IdDesignFK, OLD.status_owner, CURRENT_TIMESTAMP);

  RETURN OLD;
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

### Testando triggers
<!--deletar na tabela user_design que vai aparecer na lixeira-->
```sql

```

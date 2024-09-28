--- Create
CREATE TABLE Users (
  userID    SERIAL PRIMARY KEY,
  name      varchar(255) NOT NULL,
  email     varchar(255) NOT NULL,
  phone     varchar(15),
  password  varchar(15) NOT NULL,
  create_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
); 

CREATE TABLE Design (
  designID     SERIAL PRIMARY KEY,
  name          varchar(255) NOT NULL, 
  resolution    varchar(255) NOT NULL,
  type          varchar(255) NOT NULL,
  create_date   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE User_Design (
  IdUserFK      INTEGER,
  IdDesignFK    INTEGER,
  status_owner  BOOLEAN default false,
  create_date   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (IdUserFK) REFERENCES Users(userID),
  FOREIGN KEY (IdDesignFK) REFERENCES Design(designID)
);

CREATE TABLE Lixeira (
  IDUsuarioFK   INTEGER,
  IDDesignFK    INTEGER,
  status_owner  BOOLEAN DEFAULT FALSE,
  delete_date   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (IDUsuarioFK) REFERENCES Users(userID),
  FOREIGN KEY (IDDesignFK) REFERENCES Design(designID)
);

---Inserts

-- Inserindo dados na tabela Users
INSERT INTO Users (name, email, phone, password, create_date) 
VALUES ('João Silva', 'joao.silva@email.com', '11987654321', 'senha123', '2023-08-01 12:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Maria Oliveira', 'maria.oliveira@email.com', '21987654322', 'senha456', '2023-08-02 13:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Carlos Souza', 'carlos.souza@email.com', '31987654323', 'senha789', '2023-08-03 14:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Ana Lima', 'ana.lima@email.com', '41987654324', 'senha101', '2023-08-04 15:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Pedro Santos', 'pedro.santos@email.com', '51987654325', 'senha102', '2023-08-05 16:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Fernanda Rocha', 'fernanda.rocha@email.com', '61987654326', 'senha103', '2023-08-06 17:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Lucas Mendes', 'lucas.mendes@email.com', '71987654327', 'senha104', '2023-08-07 18:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Juliana Costa', 'juliana.costa@email.com', '81987654328', 'senha105', '2023-08-08 19:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Gabriel Almeida', 'gabriel.almeida@email.com', '91987654329', 'senha106', '2023-08-09 20:00:00');

INSERT INTO Users (name, email, phone, password, create_date)  
VALUES ('Mariana Barbosa', 'mariana.barbosa@email.com', '11987654330', 'senha107', '2023-08-10 21:00:00');


-- Inserindo dados na tabela Design
INSERT INTO Design (name, resolution, type, create_date) 
VALUES ('Design Logo A', '1920x1080', 'Logo', '2023-08-01 12:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Flyer B', '1080x1920', 'Flyer', '2023-08-02 13:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Banner C', '2560x1440', 'Banner', '2023-08-03 14:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Cartão D', '800x600', 'Cartão', '2023-08-04 15:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Poster E', '3840x2160', 'Poster', '2023-08-05 16:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Brochura F', '2100x2970', 'Brochura', '2023-08-06 17:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Outdoor G', '10240x5120', 'Outdoor', '2023-08-07 18:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Revista H', '1480x2100', 'Revista', '2023-08-08 19:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Website I', '1920x1080', 'Website', '2023-08-09 20:00:00');

INSERT INTO Design (name, resolution, type, create_date)  
VALUES ('Design Aplicativo J', '1080x1920', 'Aplicativo', '2023-08-10 21:00:00');


-- UserDesign

INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (1, 1, true, '2023-08-01 12:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (1, 3, false, '2023-08-03 14:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (2, 2, true, '2023-08-02 13:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (3, 4, true, '2023-08-04 15:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (3, 5, false, '2023-08-05 16:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (4, 6, true, '2023-08-06 17:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (5, 7, true, '2023-08-07 18:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (6, 8, false, '2023-08-08 19:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (7, 9, true, '2023-08-09 20:00:00');
INSERT INTO User_Design (IdUserFK, IdDesignFK, status_owner, create_date) VALUES (8, 10, false, '2023-08-10 21:00:00');

--- Functions

CREATE OR REPLACE FUNCTION move_to_trash() RETURNS TRIGGER AS $$
BEGIN
  INSERT INTO Lixeira (IDUsuarioFK, IDDesignFK, status_owner, delete_date)
  VALUES (OLD.IdUserFK, OLD.IdDesignFK, OLD.status_owner, CURRENT_TIMESTAMP);

  RETURN NULL;
END;
$$ LANGUAGE plpgsql;

--- Triggers

CREATE TRIGGER after_design_delete 
AFTER DELETE ON User_Design
FOR EACH ROW
EXECUTE FUNCTION move_to_trash();




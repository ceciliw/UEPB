create schema if not exists locadora;

drop table if exists locadora.telefoneCliente;
drop table if exists locadora.emailCliente;
drop table if exists locadora.emailFornecedor;
drop table if exists locadora.telefoneFornecedor;
drop table if exists locadora.locacao;
drop table if exists locadora.veiculo;
drop table if exists locadora.fornecedor;
drop table if exists locadora.cliente;

drop type if exists endereco;


create type endereco as (
    estado  varchar(25),
    cidade  varchar(50),
    bairro  varchar(50),
    rua     varchar(50),
    numero  smallint
);


create table if not exists locadora.cliente (
    id      serial primary key, -- uuid para ids complexos
    nome    varchar(100) not null,
    cpf     varchar(14) unique,
    cnpj    varchar(18) unique,-- criar especialização
    endereco    endereco, 
    cnh     varchar(11) unique not null,
    data_registro   timestamp not null default current_timestamp
);


create table if not exists locadora.fornecedor (
    id      serial primary key,-- nao necessariamente uma empresa
    nome    varchar(100),-- colocar tudo not null
    cnpj    varchar(18) unique not null, 
    endereco    endereco
);


create table if not exists locadora.veiculo (
    id      serial primary key, 
    placa   varchar(7) unique not null,
    cor     varchar(15),
    ano     smallint,
    modelo  varchar(25),
    marca   varchar(25),
    tipo    varchar(5),
    data_registro   timestamp not null default current_timestamp,
    descricao       text,--clob
    valor_diaria    real constraint nao_negativo check (valor_diaria >= 0),
    id_fornecedor   integer not null,
    foreign key(id_fornecedor) references locadora.fornecedor(id) on delete cascade
);


create table if not exists locadora.locacao (
    id              serial primary key,
    data_locacao    timestamp not null,
    data_entrega    timestamp not null,
    id_cliente  integer not null, 
    id_veiculo  integer not null,
    foreign key(id_cliente) references locadora.cliente(id) on delete cascade,
    foreign key(id_veiculo) references locadora.veiculo(id) on delete cascade
);


create table if not exists locadora.telefoneCliente (
    telefone    varchar(20) unique not null,
    id_cliente integer not null,
    foreign key(id_cliente) references locadora.cliente(id) on delete cascade
);


create table if not exists locadora.emailCliente (
    email   varchar(50) unique not null,
    id_cliente integer not null,
    foreign key(id_cliente) references locadora.cliente(id) on delete cascade
);


create table if not exists locadora.telefoneFornecedor (
    telefone    varchar(20) unique not null,
    id_fornecedor integer not null,
    foreign key(id_fornecedor) references locadora.fornecedor(id) on delete cascade
);


create table if not exists locadora.emailFornecedor (
    email   varchar(50) unique not null,
    id_fornecedor integer not null,
    foreign key(id_fornecedor) references locadora.fornecedor(id) on delete cascade
);
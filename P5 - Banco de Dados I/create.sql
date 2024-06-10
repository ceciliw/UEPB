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


create table locadora.cliente (
    id      serial primary key,
    nome    varchar(100) not null,
    cpf     varchar(14) unique,
    cnpj    varchar(18) unique,
    endereco    endereco, 
    cnh     varchar(11) unique,
    data_registro   date
);


create table locadora.fornecedor (
    id      serial primary key,
    nome    varchar(100),
    cnpj    varchar(18) unique not null, 
    endereco    endereco
);


create table locadora.veiculo (
    id      serial primary key, 
    placa   varchar(7) unique,
    cor     varchar(15),
    ano     smallint,
    modelo  varchar(25),
    marca   varchar(25),
    tipo    varchar(5),
    data_registro   date,
    descricao       text,
    valor_diaria    real,
    id_fornecedor   integer not null,
    foreign key(id_fornecedor) references locadora.fornecedor(id)
);


create table locadora.locacao (
    id              serial primary key,
    data_locacao    date,
    data_entrega    date,
    id_cliente  integer not null, 
    id_veiculo  integer not null,
    foreign key(id_cliente) references locadora.cliente(id),
    foreign key(id_veiculo) references locadora.veiculo(id)
);


create table locadora.telefoneCliente (
    telefone    varchar(20) unique not null,
    id_cliente integer not null,
    foreign key(id_cliente) references locadora.cliente(id)
);


create table locadora.emailCliente (
    email   varchar(50) unique not null,
    id_cliente integer not null,
    foreign key(id_cliente) references locadora.cliente(id)
);


create table locadora.telefoneFornecedor (
    telefone    varchar(20) unique not null,
    id_fornecedor integer not null,
    foreign key(id_fornecedor) references locadora.fornecedor(id)
);


create table locadora.emailFornecedor (
    email   varchar(50) unique not null,
    id_fornecedor integer not null,
    foreign key(id_fornecedor) references locadora.fornecedor(id)
);
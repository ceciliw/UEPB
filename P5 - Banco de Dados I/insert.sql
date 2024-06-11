insert into locadora.cliente (id, nome, cpf, cnpj, endereco, cnh, data_registro)
values
(default, 'Larissa Rocha Vieira', '000.000.000-00', null, ('Paraíba', 'João Pessoa', 'Rua das Palmeiras', 'Tambaú', 127), '000000000', '2024-05-10'::date),
(default, 'Rafael Gomes Nunes', '000.000.000-01', null, ('Paraíba', 'João Pessoa', 'Rua Professora Ednalva Oliveira', 'Altiplano', 558), '000000001', '2024-05-10'::date),
(default, 'Matheus Araújo Mendes', '000.000.000-02', null, ('Paraíba', 'João Pessoa', 'Rua João Domingos', 'Manaíra', 020), '000000002', '2024-05-10'::date),
(default, 'Sofia Moreira Fonseca', '000.000.000-03', null, ('Paraíba', 'João Pessoa', 'Avenida Almirante Tamandaré', 'Tambaú', 462), '000000003', '2024-05-10'::date),
(default, 'Soluções Inovadoras Tech Ltda.', null, '22.222.222/0001-22', ('Paraíba', 'João Pessoa', 'Avenida Epitácio Pessoa', 'Cabo Branco', 547), '000000004', '2024-05-10'::date),
(default, 'Luiza Figueiredo Rocha', '000.000.000-05', null, ('Paraíba', 'João Pessoa', 'Rua Fernando Luiz Henrique dos Santos', 'Jardim Oceania', 163), '000000005', '2024-05-10'::date),
(default, 'Pedro Henrique Costa', '000.000.000-06', null, ('Paraíba', 'João Pessoa', 'Rua Bancário Sérgio Guerra', 'Bancários', 455), '000000006', '2024-05-10'::date),
(default, 'InfoMundo tech', null, '33.333.333/0001-33', ('Paraíba', 'João Pessoa', 'Avenida Senador Ruy Carneiro', 'Miramar', 318), '000000007', '2024-05-10'::date),
(default, 'Bruno Teixeira Lopes', '000.000.000-08', null, ('Paraíba', 'João Pessoa', 'Rua Nossa Senhora dos Navegantes', 'Tamabaú', 882), '000000008', '2024-05-10'::date),
(default, 'Matheus Araújo Mendes', '000.000.000-09', null, ('Paraíba', 'João Pessoa', 'Rua Fernando Luiz Henrique dos Santos', 'Jardim Oceania', 901), '000000009', '2024-05-10'::date);


insert into locadora.fornecedor (id, nome, cnpj, endereco)
values
(default, 'LogísticaTotal Ltda.', '44.444.444/0001-44', ('Paraíba', 'João Pessoa', 'Rua Infante Dom Henrique', 'Cabo Branco', 318));


insert into locadora.veiculo (id, placa, cor, ano, modelo, marca, tipo, data_registro, descricao, valor_diaria, id_fornecedor)
values
(default, 'ABC1234', 'Prata', 2021, 'Corolla', 'Toyota', 'Carro', '2024-02-01'::date, null, 200.50, 1),
(default, 'DEF5678', 'Preto', 2019, 'Civic', 'Honda', 'Carro', '2024-02-01'::date, null, 180.00, 1),
(default, 'GHI9012', 'Branco', 2020, 'Onix', 'Chevrolet', 'Carro', '2024-02-01'::date, null, 150.70, 1),
(default, 'JKL3456', 'Azul', 2018, 'Fiesta', 'Ford', 'Carro', '2024-02-01'::date, null, 140.00, 1),
(default, 'PQR1234', 'Preto', 2020, 'CG 160', 'Honda', 'Moto', '2024-02-01'::date, null, 80.30, 1),
(default, 'STU5678', 'Azul', 2019, 'GSX-S750', 'Suzuki', 'Moto', '2024-02-01'::date, null, 150.00, 1),
(default, 'VWX9012', 'Vermelho', 2021, 'G 310 R', 'BMW', 'Moto', '2024-02-01'::date, null, 160.00, 1);


insert into locadora.locacao (id, data_locacao, data_entrega, id_cliente, id_veiculo)
values
(default, '2024-05-19'::date, '2024-05-25'::date, 1, 2),
(default, '2024-05-20'::date, '2024-05-26'::date, 6, 4),
(default, '2024-05-21'::date, '2024-05-23'::date, 8, 6),
(default, '2024-05-22'::date, '2024-05-28'::date, 3, 7);


insert into locadora.telefoneCliente (telefone, id_cliente)
values
('(83) 3146-9333', 1),
('(83) 3331-6502', 2),
('(83) 2956-5027', 3),
('(83) 2628-6628', 3),
('(83) 3641-1444', 5),
('(83) 3471-0644', 6),
('(83) 3943-5479', 6),
('(83) 2435-6762', 7),
('(83) 2298-0314', 7),
('(83) 2525-1635', 8),
('(83) 3671-7621', 9),
('(83) 2478-6862', 10);


insert into locadora.emailCliente (email, id_cliente)
values
('larissa1rocha@gmail.com', 1),
('rafaelnunes45@gmail.com', 2),
('sofiafonseca@gmail.com', 4),
('sofiamoreira98@gmail.com', 4),
('solucoesinovadoras@gmail.com', 5),
('infomundotech@gmail.com', 8),
('infomundotechsuporte@gmail.com', 8),
('brunoteixeiraa0@gmail.com', 9),
('matheus44mendes@gmail.com', 10);


insert into locadora.telefoneFornecedor (telefone, id_fornecedor)
values
('(83) 3116-0353', 1),
('(83) 3532-6858', 1),
('(83) 2382-1317', 1);


insert into locadora.emailFornecedor (email, id_fornecedor)
values
('logisticatotal@gmail.com', 1),
('fornecedor1@gmail.com', 1);


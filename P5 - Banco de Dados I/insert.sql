insert into locadora.cliente (nome, cpf, cnpj, endereco, cnh)
values
('Larissa Rocha Vieira', '000.000.000-00', null, ('Paraíba', 'João Pessoa', 'Rua das Palmeiras', 'Tambaú', 127), '000000000'),
('Rafael Gomes Nunes', '000.000.000-01', null, ('Paraíba', 'João Pessoa', 'Rua Professora Ednalva Oliveira', 'Altiplano', 558), '000000001'),
('Matheus Araújo Mendes', '000.000.000-02', null, ('Paraíba', 'João Pessoa', 'Rua João Domingos', 'Manaíra', 020), '000000002'),
('Sofia Moreira Fonseca', '000.000.000-03', null, ('Paraíba', 'João Pessoa', 'Avenida Almirante Tamandaré', 'Tambaú', 462), '000000003'),
('Soluções Inovadoras Tech Ltda.', null, '22.222.222/0001-22', ('Paraíba', 'João Pessoa', 'Avenida Epitácio Pessoa', 'Cabo Branco', 547), '000000004'),
('Luiza Figueiredo Rocha', '000.000.000-05', null, ('Paraíba', 'João Pessoa', 'Rua Fernando Luiz Henrique dos Santos', 'Jardim Oceania', 163), '000000005'),
('Pedro Henrique Costa', '000.000.000-06', null, ('Paraíba', 'João Pessoa', 'Rua Bancário Sérgio Guerra', 'Bancários', 455), '000000006'),
('InfoMundo tech', null, '33.333.333/0001-33', ('Paraíba', 'João Pessoa', 'Avenida Senador Ruy Carneiro', 'Miramar', 318), '000000007'),
('Bruno Teixeira Lopes', '000.000.000-08', null, ('Paraíba', 'João Pessoa', 'Rua Nossa Senhora dos Navegantes', 'Tamabaú', 882), '000000008'),
('Matheus Araújo Mendes', '000.000.000-09', null, ('Paraíba', 'João Pessoa', 'Rua Fernando Luiz Henrique dos Santos', 'Jardim Oceania', 901), '000000009');


insert into locadora.fornecedor (nome, cnpj, endereco)
values
('LogísticaTotal Ltda.', '44.444.444/0001-44', ('Paraíba', 'João Pessoa', 'Rua Infante Dom Henrique', 'Cabo Branco', 318));


insert into locadora.veiculo (placa, cor, ano, modelo, marca, tipo, descricao, valor_diaria, id_fornecedor)
values
('ABC1234', 'Prata', 2021, 'Corolla', 'Toyota', 'Carro', 'Carro bom todo', 200.50, 1),
('DEF5678', 'Preto', 2019, 'Civic', 'Honda', 'Carro', 'Carro muito bom', 180.00, 1),
('GHI9012', 'Branco', 2020, 'Onix', 'Chevrolet', 'Carro', null, 150.70, 1),
('JKL3456', 'Azul', 2018, 'Fiesta', 'Ford', 'Carro', null, 140.00, 1),
('PQR1234', 'Preto', 2020, 'CG 160', 'Honda', 'Moto', 'Motinha ligeira', 80.30, 1),
('STU5678', 'Azul', 2019, 'GSX-S750', 'Suzuki', 'Moto', null, 150.00, 1),
('VWX9012', 'Vermelho', 2021, 'G 310 R', 'BMW', 'Moto', null, 160.00, 1);


insert into locadora.locacao (data_locacao, data_entrega, id_cliente, id_veiculo)
values
('2024-06-11 00:00:00.063505', '2024-06-20 00:00:00.063505', 1, 2),
('2024-06-20 00:00:00.063505', '2024-06-26 00:00:00.063505', 6, 4),
('2024-06-21 00:00:00.063505', '2024-06-23 00:00:00.063505', 8, 6),
('2024-06-22 00:00:00.063505', '2024-06-28 00:00:00.063505', 3, 7);


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


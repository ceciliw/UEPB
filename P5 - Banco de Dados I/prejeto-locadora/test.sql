-- Demonstrando o funcionamento do banco
select 
	cli.nome,
	vei.valor_diaria,
	ceil(extract(epoch from loc.data_entrega - loc.data_locacao) / 86400) as quant_dias,
	ceil(extract(epoch from loc.data_entrega - loc.data_locacao) / 86400) * vei.valor_diaria as total
from locadora.locacao as loc
inner join locadora.cliente as cli
	on cli.id = loc.id_cliente
inner join locadora.veiculo as vei
	on loc.id_veiculo = vei.id
order by total desc;


-- Inserindo valores nulos
insert into locadora.cliente (nome, cpf, cnpj, endereco, cnh)
values
('Eduardo Carvalho Da Nóbrega', '000.000.000-10', null, ('Paraíba', 'João Pessoa', 'Rua Juarez Távora', 'Tambauzinho', 187), null);


-- Inserindo valores repetidos 
insert into locadora.fornecedor (nome, cnpj, endereco)
values
('Mais Transportes Ltda.', '44.444.444/0001-44', ('Paraíba', 'João Pessoa', 'Avenida Presidente Epitácio Pessoa', 'Tambiá', 813));


-- Inserindo valores de tipos incorretos
insert into locadora.veiculo (placa, cor, ano, modelo, marca, tipo, descricao, valor_diaria, id_fornecedor)
values
('STZ5668', 'Azul', 2019, 'GSX-S750', 'Suzuki', 'Moto', null, '150.0y', 1);


-- Inserindo valores de tamanhos incorretos
insert into locadora.cliente (nome, cpf, cnpj, endereco, cnh)
values
('Amanda Barbosa Martins', '000.000.000-111', null, ('Paraíba', 'João Pessoa', 'Rua Barão do Triunfo', 'Trincheiras', 043), '000000011');


-- Inserindo chaves estrangeiras que não existem
insert into locadora.veiculo (placa, cor, ano, modelo, marca, tipo, descricao, valor_diaria, id_fornecedor)
values
('PLT5287', 'Prata', 2021, 'Corolla', 'Toyota', 'Carro', null, 200.50, 5);


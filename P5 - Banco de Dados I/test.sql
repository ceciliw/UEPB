-- Demonstrando o funcionamento do banco
select 
	cli.nome,
	vei.valor_diaria,
	loc.data_entrega-loc.data_locacao as quant_dias,
	(loc.data_entrega-loc.data_locacao)*vei.valor_diaria as total
from locadora.locacao as loc
inner join locadora.cliente as cli
	on cli.id = loc.id_cliente
inner join locadora.veiculo as vei
	on loc.id_veiculo = vei.id
order by total desc


-- Inserindo valores nulos
insert into locadora.cliente (id, nome, cpf, cnpj, endereco, cnh, data_registro)
values
(null, 'Eduardo Carvalho Da Nóbrega', '000.000.000-10', null, ('Paraíba', 'João Pessoa', 'Rua Juarez Távora', 'Tambauzinho', 187), null, '2024-05-10'::date);


-- Inserindo valores repetidos 
insert into locadora.fornecedor (id, nome, cnpj, endereco)
values
(default, 'Mais Transportes Ltda.', '44.444.444/0001-44', ('Paraíba', 'João Pessoa', 'Avenida Presidente Epitácio Pessoa', 'Tambiá', 813));


-- Inserindo valores de tipos incorretos
insert into locadora.veiculo (id, placa, cor, ano, modelo, marca, tipo, data_registro, descricao, valor_diaria, id_fornecedor)
values
(default, 'STZ5668', 'Azul', 2019, 'GSX-S750', 'Suzuki', 'Moto', '2024-02-01'::date, null, '150.0y', 1);


-- Inserindo valores de tamanhos incorretos
insert into locadora.cliente (id, nome, cpf, cnpj, endereco, cnh, data_registro)
values
(default, 'Amanda Barbosa Martins', '000.000.000-111', null, ('Paraíba', 'João Pessoa', 'Rua Barão do Triunfo', 'Trincheiras', 043), '000000000', '2024-05-10'::date);


-- Inserindo chaves estrangeiras que não existem
insert into locadora.veiculo (id, placa, cor, ano, modelo, marca, tipo, data_registro, descricao, valor_diaria, id_fornecedor)
values
(default, 'PLT5287', 'Prata', 2021, 'Corolla', 'Toyota', 'Carro', '2024-02-01'::date, null, 200.50, 5);


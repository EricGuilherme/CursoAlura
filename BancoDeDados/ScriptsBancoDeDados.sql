	-- ExerciciosSQLAluraBluesoft

create database if not exists mercado_compras ;

use controle_compras;

create table compras (

	id		int auto_increment primary key,
	valor 		double,
	data 		date,
	recebido	boolean,
	observacoes	varchar(255)
);

insert into compras (valor, data, recebido, observacoes) values (1500.00, '2014/09/10', 1, 'geladeira com defeito');
outros inserts .... 


create table compradores (
	id int auto_increment,
	nome varchar(255),
	endereco varchar(255),
	telefone varchar(20),
	primary key(id)
);

insert into compradores (nome, endereco, telefone) values ('Ricardo', 'Av. Paulista', '4455-6600');
insert into compradores (nome, endereco, telefone) values ('Eric', 'Morumbi', '4798-6600');

alter table compras add column id_comprador int;
update compras set id_comprador = 2 where id < 8;
update compras set id_comprador = 1 where id > 8;


--Selecione VALOR e OBSERVAÇÕES de todas as compras cuja data seja maior-ou-igual que 15/12/2008. Cole a instrução SQL aqui quando acabar.
select valor, observacoes from compras data >= '15/12/2008';

--Selecione todas as compras cuja data seja maior-ou-igual que 15/12/2008 e menor do que 15/12/2010. Cole a instrução SQL aqui quando acabar.
select valor, observacoes from compras data >= '15/12/2008' and data < '15/12/2008';

--Selecione todas as compras cujo valor esteja entre R$15,00 e R$35,00 e a observação comece com a palavra 'LANCHONETE'. Cole a instrução SQL aqui quando acabar.
select * from compras where valor >= 15.00 and valor <= 35.00 and observacoes like 'LANCHONETE%'; 

--Selecione todas as compras que já foram recebidas. Cole a instrução SQL aqui quando acabar.
select * from compras where recebido = 1;

--Selecione todas as compras que ainda não foram recebidas. Cole a instrução SQL aqui quando acabar.
select * from compras where recebido <> 1;

--Selecione todas as compras com valor maior que 5.000,00 ou que já foram recebidas. Cole a instrução SQL aqui quando acabar.
select * from compras where valor > 5000 or recebido = true;	

--Selecione todas as compras que o valor esteja entre 1.000,00 e 3.000,00 ou seja maior que 5.000,00. Cole a instrução SQL aqui quando acabar.
select * from compras where (valor <= 3000 and valor >= 1000) or (valor > 5000);

--Altere as compras, colocando a observação 'preparando o natal' para todas as que foram efetuadas no dia 20/12/2010
update compras set observacoes = 'preparando o natal' where data = '2010-12-20';

--Altere o VALOR das compras feitas antes de 01/06/2009. Some R$10,00 ao valor atual.
update compras set valor = valor + 10.00 where data < '2009-06-01';

--Atualize todas as compras feitas entre 01/07/2009 e 01/07/2010 para que elas tenham a observação 'entregue antes de 2011' e a coluna recebido com o valor TRUE.
update compras set observacoes = 'entregue antes de 2011', recebido = true where data between '2009-07-01' and '2010-07-01';

--Exclua as compras realizadas entre 05 e 20 março de 2009. Coloque abaixo o comando executado
delete from compras where data between '2009-03-05' and '2009-03-20'; 

--Use o operador NOT e monte um SELECT que retorna todas as compras com valor diferente de R$ 108,00.
select * from compras where not valor = 108.00;

--Configure a coluna OBSERVACOES para não aceitar valores nulos. Cole o comando SQL aqui.
--Se o seu comando falhar, pode ser porque você já tem elementos nulos na tabela, e o MySQL não consegue colocar essa condição, pois linhas que já existem fogem da regra. Nesse caso, faça um UPDATE, e coloque valores em todos os campos nulos.	
alter table compras modify observacoes varchar(255) not null; 


--Configure o valor padrão para a coluna RECEBIDO. Cole o comando SQL aqui.
alter table compras modify recebido tinyint(1) default '0';

--Crie a coluna FORMA_PAGTO, sendo um enum que suporte CARTAO, BOLETO e DINHEIRO.
--Faça um SELECT na tabela. Veja que os valores dessa coluna ficaram todos como NULL. Coloque uma forma de pagamento para todas elas (você pode usar tanto o MySQL Workbench, quanto o comando UPDATE já estudado).
alter table compras add column forma_pagt enum('cartao', 'boleto', 'dinheiro');
select * from compras;
update compras set forma_pagt = 'boleto' where forma_pagt is null;

--Reescreva o CREATE TABLE do começo do curso, marcando OBSERVACOES como nulo, valor padrão do RECEBIDO como 1, e FORMA_PAGTO como ENUM que aceita DINHEIRO, CARTAO, BOLETO.
create table compras (
	id			int auto_increment primary key,
	valor 		double,
	data 		date,
	recebido	tinyint(1) default '1' ,
	observacoes	varchar(255) not null,
	forma_pagt 	enum ('dinheiro', 'cartao', 'boleto')
);

--Calcule a média de todas as compras com datas inferiores a 12/05/2009. Cole a instrução SQL aqui quando acabar
select avg(valor) as media from compras where data < '2009-05-12';

--Calcule a soma de todas as compras com datas inferiores a 10/10/2010, agrupadas por forma de pagamento. Cole a instrução SQL aqui quando acabar.
select forma_pagt, sum(valor) as soma from compras where data < '2010-10-10' group by forma_pagt;

--Calcule a quantidade de compras com datas inferiores a 12/05/2009 e que já foram recebidas. Cole a instrução SQL aqui quando acabar
select count(id) as Quantidade from compras where data < '2009-05-12' and recebido = true;

--Calcule a soma de todas as compras, agrupadas por forma de pagamento e compra recebida ou não. Cole a instrução SQL aqui quando acabar.
select forma_pagt, recebido, sum(valor) as Soma from compras group by forma_pagt, recebido;

--Exiba o NOME do comprador e o VALOR de todas as compras feitas antes de 09/08/2010. Coloque o resultado aqui.
select nome, valor from compras join compradores on compras.id_comprador = compradores.id where data < '210-08-09';

--Exiba todas as compras do comprador que possui ID igual a 1.
select * from compras where id_comprador = 1; 

--Exiba todas as compras (mas sem os dados do comprador), cujo comprador tenha nome que começa com 'GUILHERME'.
select compras. * from compras inner join compradores on compras.id_comprador = compradores.id where nome like 'Ric%';

--Exiba o nome do comprador e a soma de todas as suas compras.
select compradores. nome, sum(valor) from compras inner join compradores on compras.id_comprador = compradores.id group by compradores.nome;  


-- Treinos

insert into compras (valor, data, observacoes) values (255, '2010-05-20', 'presente dia das maes');
insert into compras (valor, data, observacoes, recebido) values (88, '2014-09-05', null, 1);
insert into compras (valor, data, observacoes, forma_pagt) values (255, '2010-05-20', 'presente dos pais', 'cartao');

update compras set valor = 900 where id = 20;
update compras set valor = 900 , observacoes = FESTA DE ANIVERSARIO where id = 20;	
update compras set forma_pagt = 'boleto' where forma_pagt is null;

alter table compras add foreign key (id_comprador) references compradores(id);

select * from compras;
select data, valor from compras;
select * from compras where valor > 1000;	
select * from compras where valor > 1000 and data = '2014/09/10';
select * from compras where valor > 1000 and data = '2014/09/10' or recebido = 1;
select * from compras where valor <> 500;
select * from compras where observacoes like '%celular%';
select * from compras where valor between 200 and 1500;
select * from compras where valor between 200 and 1500 and data > '2014/01/01';
select sum(valor) from compras;
select sum(valor) from compras where data > '2014-05-05';
select count(valor) from compras;
select sum(valor), count(valor) from compras;
select sum(valor), count(valor) from compras where data > '2014-06-05';
select recebido, sum(valor) from compras group by recebido; 
select recebido, sum(valor) from compras where valor < 500 group by recebido; 
select month(data), year(data), sum(valor) from compras group by month(data), year(data) order by year(data), month(data);
select avg(valor) as media from compras;
select month(data) as Mes, year(data) as Ano, avg(valor) as Media_Mensal from compras group by month(data), year(data) order by year(data), month(data);
select observacoes, valor, nome from compras join compradores on compras.id_comprador = compradores.id;
select * from compras join compradores on compras.id_comprador = compradores.id;
select * from compras where observacoes is null;
select * from compras where observacoes is not null;
select nome, valor from compras inner join compradores on compras.id_comprador = compradores.id where data < '2010-08-09';
select * from compras inner join compradores on compras.id_comprador = compradores.id where id_comprador = 1;

delete from compras where id = 44;

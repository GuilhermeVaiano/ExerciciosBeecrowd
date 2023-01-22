USE beecrowd;
--https://www.beecrowd.com.br/judge/pt/problems/view/2615
--DROP TABLE CUSTOMERS;

CREATE TABLE dbo.CUSTOMERS (
	id		 numeric(3,0)         PRIMARY KEY,
	nome	 varchar(100),
	street   varchar(50),
	city     varchar(50),
);



INSERT INTO dbo.CUSTOMERS (id,nome,street,city) VALUES
	(1,'Giovanna Goncalves Oliveira','Rua Mato Grosso','Canoas'),
	(2,'Kau� Azevedo Ribeiro','Travessa Ibi�','Uberl�ndia'),
	(3,'Rebeca Barbosa Santos','Rua Observat�rio Meteorol�gico','Salvador'),
	(4,'Sarah Carvalho Correia','Rua Ant�nio Carlos da Silva','Uberl�ndia'),
	(5,'Jo�o Almeida Lima','Rua Rio Taiuva','Ponta Grossa'),
	(6,'Diogo Melo Dias','Rua Duzentos e Cinq�enta','V�rzea Grande');


SELECT DISTINCT city 'city'
	FROM dbo.customers
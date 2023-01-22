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
	(2,'Kauã Azevedo Ribeiro','Travessa Ibiá','Uberlândia'),
	(3,'Rebeca Barbosa Santos','Rua Observatório Meteorológico','Salvador'),
	(4,'Sarah Carvalho Correia','Rua Antônio Carlos da Silva','Uberlândia'),
	(5,'João Almeida Lima','Rua Rio Taiuva','Ponta Grossa'),
	(6,'Diogo Melo Dias','Rua Duzentos e Cinqüenta','Várzea Grande');


SELECT DISTINCT city 'city'
	FROM dbo.customers
create database PraticaJogador;

use PraticaJogador;

create table timeF (
idTime int primary key auto_increment,
nomeTime varchar(45),
dataFund date,
nomeTecnico varchar(45)
);

insert into timeF values 
(null, 'Sport', '1908/02/25', 'Vanderlei Luxemburgo'),
(null, 'Corinthans', '1910/07/10', 'Vagner Mancini'),
(null, 'Atlético Mineiro', '1912/02/18', 'San Paoli');

create table jogador (
idJogador int primary key auto_increment,
nomeJogador varchar(45),
posicao varchar(45),
salario decimal(6,2),
fkTime int,
fkConselheiro int,
foreign key (fkTime) references timef (idTime),
foreign key (fkConselheiro) references jogador (idJogador)
)auto_increment=1000;

insert into jogador values
(null, 'Matheus Davó', 'Atacante', 1003.50, 2, 1001);

insert into jogador values
(null, 'Cazares', 'Meio-Campista', 1950.00, 2, null),
(null, 'Magrão', 'Goleiro', 2610.00, 1, null),
(null, 'Diogo Barbosa', 'Lateral', 1800.00, 3, null);

select * from jogador;

create table seguidor (
idSeguidor int,
nomeSeguidor varchar(45),
nickName varchar(45),
sexo varchar(45),
fkJogador int,
foreign key (fkJogador) references jogador (idJogador),
primary key (idSeguidor, fkJogador)
)auto_increment= 10000;

alter table seguidor add check (sexo = 'M' or sexo = 'F'); 

insert into seguidor values
(10000, 'Fábio', 'FabinhoPalmeirense51', 'M', 1002),
(10001, 'Flávia Morais', 'FlavinhaQueen', 'F', 1000);

update seguidor set idSeguidor = 10001 where fkJogador = 1002;
insert into seguidor values
(10002, 'Steve Tonino', 'StevoMenino', 'M', 1000);

select * from seguidor;











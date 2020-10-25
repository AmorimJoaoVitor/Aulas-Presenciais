create database residencial;

use residencial;

create table condominio (
idCondominio int primary key auto_increment,
nomeCond varchar(45),
descricao varchar(100),
cep char(8),
logradouro varchar(45),
numero int,
bairro varchar(45),
cidade varchar(45)
);

insert into condominio values
(null, "Mirassol", "Muito bem localizado, ao lado do shopping", "04849334", "Rua projetada", 73, "Chácara Gonçalo", "São Paulo"),
(null, "Marajoara", "Área de lazer, perto do shopping", "04843578", "Avenida Sabará", 4875, "Sabará", "São Paulo");

select * from condominio;

create table unidade (
idUnidade int auto_increment,
fkCondominio int,
apartamento int,
andar int,
foreign key (fkCondominio) references condominio (idCondominio),
primary key (idUnidade, fkCondominio)
)auto_increment = 100;

alter table unidade add column fkPessoa int;
alter table unidade add foreign key (fkPessoa) references pessoa (idPessoa);

insert into unidade values
(null, 2, 1, 1, 1000),
(null, 1, 3, 3, 1001);

select * from unidade;

create table pessoa(
idPessoa int auto_increment primary key,
nomePessoa varchar(45),
telefone1 varchar(13),
telefone2 varchar(13)
)auto_increment= 1000;

insert into pessoa values
(null, "Gabi Lima", "999838972", "59324597"),
(null, "Steve Rego", "923746587", "59337519");

select * from pessoa;

create table posse(
fkPessoa int,
fkCondominio int,
fkUnidade int,
porcentagem varchar(45),
foreign key (fkPessoa) references pessoa (idPessoa),
foreign key (fkCondominio) references condominio (idCondominio),
foreign key (fkUnidade) references unidade (idUnidade),
primary key (fkPessoa, fkCondominio, fkUnidade)
);

insert into posse values
(1001, 1, 101, "100%"),
(1000, 2, 100, "100%");

select * from posse;












DROP TABLE vets;

CREATE TABLE vets (
  id int identity (1,1) primary key,
  first_name VARCHAR(30),
  last_name VARCHAR(30)
);

DROP TABLE specialties;

CREATE TABLE specialties (
  id int identity (1,1) primary key,
  name VARCHAR(80)
);

DROP TABLE vet_specialties
CREATE TABLE vet_specialties (
  vet_id INT,
  specialty_id INT
);

DROP TABLE types;

CREATE TABLE types (
  id int identity (1,1) primary key,
  name VARCHAR(80)
);

DROP TABLE owners;

CREATE table owners (
  id int identity (1,1) primary key,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  address VARCHAR(255),
  city VARCHAR(80),
  telephone VARCHAR(20)
) ;

DROP TABLE pets;

CREATE TABLE pets (
  id int identity (1,1) primary key,
  name VARCHAR(30),
  birth_date DATE,
  type_id INT NOT NULL,
  owner_id INT NOT NULL
) ;

DROP TABLE  visits;

CREATE TABLE  visits (
  id int identity (1,1) primary key,
  pet_id INT NOT NULL,
  visit_date DATE,
  description VARCHAR(255)
);



/**
  login
**/

drop table if exists usuario_grupo;
drop table if exists usuario_permissao;
drop table if exists grupo_permissao;
drop table if exists permissao;
drop table if exists grupo;
drop table if exists usuario;

create table  usuario (
	id int identity (1,1) primary key,
	nome varchar(100) not null,
	login varchar(50) not null,
	senha varchar(100) not null,
	ativo smallint  
);

create table permissao (
	id  int identity (1,1) primary key,
	nome varchar(100) not null
);

create table usuario_permissao (
	usuario_id int not null,
	permissao_id varchar(50) not null
);

create table grupo (
	id  int identity (1,1) primary key,
	nome varchar(100) not null
);

create table usuario_grupo (
	usuario_id int not null,
	grupo_id int not null
);

create table grupo_permissao (
	grupo_id int not null,
	permissao_id varchar(50) not null
);
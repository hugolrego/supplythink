INSERT INTO vets VALUES ('James', 'Carter');
INSERT INTO vets VALUES ('Helen', 'Leary');
INSERT INTO vets VALUES ('Linda', 'Douglas');
INSERT INTO vets VALUES ('Rafael', 'Ortega');
INSERT INTO vets VALUES ('Henry', 'Stevens');
INSERT INTO vets VALUES ('Sharon', 'Jenkins');

INSERT INTO specialties VALUES ('radiology');
INSERT INTO specialties VALUES ('surgery');
INSERT INTO specialties VALUES ('dentistry');

INSERT INTO vet_specialties VALUES (2, 1);
INSERT INTO vet_specialties VALUES (3, 2);
INSERT INTO vet_specialties VALUES (3, 3);
INSERT INTO vet_specialties VALUES (4, 2);
INSERT INTO vet_specialties VALUES (5, 1);

INSERT INTO types VALUES ('cat');
INSERT INTO types VALUES ('dog');
INSERT INTO types VALUES ('lizard');
INSERT INTO types VALUES ('snake');
INSERT INTO types VALUES ('bird');
INSERT INTO types VALUES ('hamster');

INSERT INTO owners VALUES ('George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owners VALUES ('Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owners VALUES ('Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO owners VALUES ('Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO owners VALUES ('Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO owners VALUES ('Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owners VALUES ('Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owners VALUES ('Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO owners VALUES ('David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO owners VALUES ('Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO pets VALUES ('Leo', '2000-09-07', 1, 1);
INSERT INTO pets VALUES ('Basil', '2002-08-06', 6, 2);
INSERT INTO pets VALUES ('Rosy', '2001-04-17', 2, 3);
INSERT INTO pets VALUES ('Jewel', '2000-03-07', 2, 3);
INSERT INTO pets VALUES ('Iggy', '2000-11-30', 3, 4);
INSERT INTO pets VALUES ('George', '2000-01-20', 4, 5);
INSERT INTO pets VALUES ('Samantha', '1995-09-04', 1, 6);
INSERT INTO pets VALUES ('Max', '1995-09-04', 1, 6);
INSERT INTO pets VALUES ('Lucky', '1999-08-06', 5, 7);
INSERT INTO pets VALUES ('Mulligan', '1997-02-24', 2, 8);
INSERT INTO pets VALUES ('Freddy', '2000-03-09', 5, 9);
INSERT INTO pets VALUES ('Lucky', '2000-06-24', 2, 10);
INSERT INTO pets VALUES ('Sly', '2002-06-08', 1, 10);

INSERT INTO visits VALUES (7, '2010-03-04', 'rabies shot');
INSERT INTO visits VALUES (8, '2011-03-04', 'rabies shot');
INSERT INTO visits VALUES (8, '2009-06-04', 'neutered');
INSERT INTO visits VALUES (7, '2008-09-04', 'spayed');


INSERT INTO stock_location_type VALUES ('São Paulo');
INSERT INTO stock_location_type VALUES ('Sudeste');
INSERT INTO stock_location_type VALUES ('Lojas Físicas');
delete from stock_location_type where id > 3

INSERT INTO stock_location VALUES ('Morumbi');
INSERT INTO stock_location VALUES ('Vila Olimpia');
INSERT INTO stock_location VALUES ('Bresser');
INSERT INTO stock_location VALUES ('Ibirapuera');
INSERT INTO stock_location VALUES ('Itaquera');
INSERT INTO stock_location VALUES ('Sumaré');
INSERT INTO stock_location VALUES ('Centro');
INSERT INTO stock_location VALUES ('Pinheiros');
INSERT INTO stock_location VALUES ('Santo Amaro');
INSERT INTO stock_location VALUES ('Vila Madalena');
INSERT INTO stock_location VALUES ('Brooklin');
INSERT INTO stock_location VALUES ('Moema');

delete from stock_location_groups
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (1,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (1,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (1,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (2,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (2,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (2,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (3,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (3,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (3,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (4,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (4,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (4,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (5,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (5,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (5,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (6,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (6,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (6,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (7,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (7,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (7,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (8,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (8,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (8,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (9,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (9,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (9,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (10,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (10,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (10,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (11,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (11,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (11,3,3);

INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (12,1,1);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (12,2,2);
INSERT INTO stock_location_groups (id_stock_location, id_type,groups)VALUES (12,3,3);


/*
login
**/
insert into permissao (nome) values ('ROLE_STOCK');
insert into permissao (nome) values ('ROLE_DEMAND');
insert into permissao (nome) values ('ROLE_COLLABORATIVE');
insert into permissao (nome) values ('ROLE_ALL');
	
insert into usuario (nome, login, senha, ativo) values ('Camilo-S', 'camilo', '$2a$10$IC3RnOh5nWI/NOsxhfMwreKn6Jz/0zy2QtzI.rQJ8Xc.yxBiAyaIO', 1);
insert into usuario (nome, login, senha, ativo) values ('Leonardo-D', 'leonardo', '$2a$10$IC3RnOh5nWI/NOsxhfMwreKn6Jz/0zy2QtzI.rQJ8Xc.yxBiAyaIO', 1);
insert into usuario (nome, login, senha, ativo) values ('Hugo-C', 'hugo', '$2a$10$IC3RnOh5nWI/NOsxhfMwreKn6Jz/0zy2QtzI.rQJ8Xc.yxBiAyaIO', 1);

insert into usuario_permissao (usuario_id, permissao_id) values (1, 1);
insert into usuario_permissao (usuario_id, permissao_id) values (1, 4);
insert into usuario_permissao (usuario_id, permissao_id) values (2, 2);
insert into usuario_permissao (usuario_id, permissao_id) values (2, 4);
insert into usuario_permissao (usuario_id, permissao_id) values (3, 3);
insert into usuario_permissao (usuario_id, permissao_id) values (3, 4);


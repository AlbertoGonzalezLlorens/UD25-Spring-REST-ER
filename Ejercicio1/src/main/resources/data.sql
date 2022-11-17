drop table if exists fabricantes;
create table fabricantes (
id int auto_increment primary key,
nombre nvarchar(100)
);

drop table if exists articulos;
create table articulos (
id int auto_increment primary key,
nombre nvarchar(100),
precio int,
fabricante int,
foreign key (fabricante) references fabricantes(id) on delete set null on update cascade
);

insert into fabricantes (nombre)values('Fabricante 1');
insert into fabricantes (nombre)values('Fabricante 2');
insert into fabricantes (nombre)values('Fabricante 3');
insert into fabricantes (nombre)values('Fabricante 4');

insert into articulos (nombre,precio,fabricante)values('Articulo 1', 125,1);
insert into articulos (nombre,precio,fabricante)values('Articulo 2', 125,1);
insert into articulos (nombre,precio,fabricante)values('Articulo 3', 125,2);
insert into articulos (nombre,precio,fabricante)values('Articulo 4', 125,3);

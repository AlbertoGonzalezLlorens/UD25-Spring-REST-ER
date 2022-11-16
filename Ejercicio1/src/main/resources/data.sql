drop table if exists fabricante;
create table fabricante (
codigo long auto_increment primary key,
nombre nvarchar(100)
);

drop table if exists articulos;
create table articulos (
codigo long auto_increment primary key,
nombre nvarchar(100),
precio int,
fabricante long,
foreign key (fabricante) references fabricante(codigo) on delete set null on update cascade
);

insert into fabricante (nombre)values('Fabricante 1');
insert into fabricante (nombre)values('Fabricante 2');
insert into fabricante (nombre)values('Fabricante 3');
insert into fabricante (nombre)values('Fabricante 4');

insert into articulos (nombre,precio,fabricante)values('Articulo 1', 125,1);
insert into articulos (nombre,precio,fabricante)values('Articulo 2', 125,1);
insert into articulos (nombre,precio,fabricante)values('Articulo 3', 125,2);
insert into articulos (nombre,precio,fabricante)values('Articulo 4', 125,3);

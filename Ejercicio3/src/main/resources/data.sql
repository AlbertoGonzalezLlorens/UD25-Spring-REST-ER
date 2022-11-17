drop table if exists almacenes;
create table almacenes(
codigo long auto_increment primary key,
lugar nvarchar(100),
capacidad int
);

drop table if exists cajas;
create table cajas(
numreferencia char(5) primary key,
contenido nvarchar(100),
valor int,
almacen long,
foreign key (almacen) references almacenes(codigo) on delete set null on update cascade
);

insert into almacenes(lugar,capacidad) values ('Lugar 1',1000000);
insert into almacenes(lugar,capacidad) values ('Lugar 2',2000000);
insert into almacenes(lugar,capacidad) values ('Lugar 3',3000000);

insert into cajas(numreferencia,contenido,valor,almacen) values ('111AA','Elemento 1',20,1);
insert into cajas(numreferencia,contenido,valor,almacen) values ('111BB','Elemento 2',10,1);
insert into cajas(numreferencia,contenido,valor,almacen) values ('111CC','Elemento 3',30,2);
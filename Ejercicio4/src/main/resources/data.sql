drop table if exists peliculas;
create table peliculas(
id int auto_increment primary key,
nombre nvarchar(100),
clasificacionedad int
);

drop table if exists salas;
create table salas(
id int auto_increment primary key,
nombre nvarchar(100),
pelicula int,
foreign key (pelicula) references peliculas(id) on delete set null on update cascade
);

insert into peliculas(nombre,clasificacionedad) values ('El arca',6);
insert into peliculas(nombre,clasificacionedad) values ('El arca 2',6);
insert into peliculas(nombre,clasificacionedad) values ('El arca the beginning',6);

insert into salas(nombre,pelicula) values ('sala 1',1);
insert into salas(nombre,pelicula) values ('sala 2',2);
insert into salas(nombre,pelicula) values ('sala 3',3);
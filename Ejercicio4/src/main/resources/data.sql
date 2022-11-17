drop table if exists departamentos;
create table departamentos(
codigo long auto_increment primary key,
nombre nvarchar(100),
presupuesto int
);

drop table if exists empleados;
create table empleados(
dni varchar(8) primary key,
nombre nvarchar(100),
apellidos nvarchar(255),
departamento long,
foreign key (departamento) references departamentos(codigo) on delete set null on update cascade
);

insert into departamentos(nombre,presupuesto) values ('Departamento 1',1000000);
insert into departamentos(nombre,presupuesto) values ('Departamento 2',2000000);
insert into departamentos(nombre,presupuesto) values ('Departamento 3',3000000);

insert into empleados(dni,nombre,apellidos,departamento) values ('11111111','Nombre 1','Apellido 1',1);
insert into empleados(dni,nombre,apellidos,departamento) values ('11111112','Nombre 2','Apellido 2',1);
insert into empleados(dni,nombre,apellidos,departamento) values ('11111113','Nombre 3','Apellido 3',3);
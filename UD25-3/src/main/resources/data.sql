create table almacenes(
codigo int not null primary key,
lugar varchar(100),
capacidad int
);
create table cajas(
num_referencia varchar(5) primary key not null,
contenido varchar(100),
valor int,
almacen int,
foreign key (almacen) references almacenes(codigo)
);

insert into almacenes(codigo,lugar,capacidad) values(1,'Barcelona',10000);
insert into almacenes(codigo,lugar,capacidad) values(2,'Reus',5000);

insert into cajas(num_referencia,contenido,valor,almacen) values('bar01','Xiaomi 10',20000,1);
insert into cajas(num_referencia,contenido,valor,almacen) values('bar02','Samsumg 10',30000,1);
insert into cajas(num_referencia,contenido,valor,almacen) values('bar03','Lenovo idea path5',20000,1);

insert into cajas(num_referencia,contenido,valor,almacen) values('reu01','Xiaomi 10',10000,2);
insert into cajas(num_referencia,contenido,valor,almacen) values('reu02','Lenovo idea path5',16000,2);
insert into cajas(num_referencia,contenido,valor,almacen) values('reu03','Lenovo idea path5',3000,2);
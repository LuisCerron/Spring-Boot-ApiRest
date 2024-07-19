INSERT INTO fabricante(id, nombre) VALUES (1, 'Asus');
INSERT INTO fabricante(id, nombre) VALUES (2, 'Lenovo');
INSERT INTO fabricante(id, nombre) VALUES (3, 'Hewlett-Packard');
INSERT INTO fabricante(id, nombre) VALUES (4, 'Samsung');
INSERT INTO fabricante(id, nombre) VALUES (5, 'Seagate');
INSERT INTO fabricante(id, nombre) VALUES (6, 'Crucial');
INSERT INTO fabricante(id, nombre) VALUES (7, 'Gigabyte');
INSERT INTO fabricante(id, nombre) VALUES (8, 'Huawei');
INSERT INTO fabricante(id, nombre) VALUES (9, 'Xiaomi');

INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(1, 'Disco duro SATA3 1TB', 86.99, 10, 5);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(2, 'Memoria RAM DDR4 8GB', 120, 4, 6);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(3, 'Disco SSD 1 TB', 150.99, 6, 4);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(4, 'GeForce GTX 1050Ti', 185, 8, 7);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 12, 6);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(6, 'Monitor 24 LED Full HD', 282, 2, 1);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(7, 'Monitor 27 LED Full HD', 245.99, 3, 1);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(8, 'Portatil Yoga 520', 559, 4, 2);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(9, 'Portatil Ideapd 320', 44, 7, 2);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 10, 3);
INSERT INTO producto(id, nombre, precio,stock, id_fabricante) VALUES(11, 'Impresora HP LaseJet Pro M26nw', 180, 4, 3);

INSERT INTO cliente(id ,direccion,dni,nombre,telefono) VALUES(1,'Psje.Mercurio','74512464', 'Luis Cerron','945454658');

INSERT INTO usuario(id,correo,nombre,pass,rol) VALUES(1,'altronservice80@gmail.com','Asistente1','123456','ASISTENTE');

INSERT INTO venta(id,total,fecha,id_cliente,id_usuario) VALUES(1,164.00,'2024-10-24',1,1);

INSERT INTO detalle_venta(id,cantidad,precio,id_producto,id_venta) VALUES (1, 1, 120,2,1);
INSERT INTO detalle_venta(id,cantidad,precio,id_producto,id_venta) VALUES (2, 1, 44,9,1);
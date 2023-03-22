-- Ejercicio 01

INSERT INTO fabricante(id,nombre) VALUES (10,"Apple"); 


-- Ejercicio 02

INSERT INTO fabricante(nombre) VALUES ("MSI"), ("TP-Link"); 

-- Ejercicio 03

INSERT INTO producto(id,nombre,precio, id_fabricante) VALUES (12,"Iphone 4",120,10); 

-- Ejercicio 04

INSERT INTO producto(nombre,precio, id_fabricante) VALUES ("Portatil",999,11), ("Router",50,12); 

-- Ejercicio 05

CREATE TABLE fabricante_productos (
 nombre_fabricante VARCHAR(100),
 nombre_producto VARCHAR(100),
   precio DECIMAL(5,2) 
);

INSERT INTO fabricante_productos SELECT fabricante.nombre, producto.nombre, producto.precio
 FROM fabricante JOIN producto ON(fabricante.id=producto.id_fabricante);


 -- Ejercicio 06

CREATE VIEW vista_fabricante_productos
AS SELECT * FROM fabricante_productos;

-- Ejercicio 07
DELETE FROM producto WHERE nombre = "Xiaomi";


-- Ejercicio 08

DELETE FROM producto WHERE nombre = "Asus";

-- Ejercicio 10

UPDATE fabricante SET id = 30 WHERE nombre = "Huawei";

-- Ejercicio 11

/*
Se deberia de haber habilitado la opcion de ON UPDATE CASCADE al
crear la tabla.
*/

-- Ejercicio 12

DELETE FROM producto WHERE nombre LIKE '%impresora%' AND precio < 200;

-- Ejercicio 13
UPDATE producto SET precio = precio*1.05 
WHERE id_fabricante IN (SELECT id
                        FROM fabricante
                         WHERE nombre LIKE '_e%');

-- Ejercicio 14
UPDATE fabricante SET nombre = CONCAT(nombre, '*') 
WHERE id IN ( SELECT id_fabricante 
                FROM producto GROUP BY id_fabricante 
                HAVING AVG(precio) > 200); 

-- Ejercicio 15


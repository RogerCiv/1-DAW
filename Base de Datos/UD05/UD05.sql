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

DELETE FROM fabricante 
WHERE nombre NOT IN (SELECT nombre_fabricante
                     FROM fabricante_productos);


-- Ejercicio 16

INSERT INTO socio (num_socio, nombre, apellido1, domicilio, poblacion, fec_nac)
VALUES (1007, "Francisco", "Sanchez", "Avda de las Palmeras, 2", "Armilla", "1970/02/02");

-- Ejercicio 17

INSERT INTO alquiler (copia_pel, socio, fec_alquila) VALUES (105, 1007, CURDATE());


-- Ejercicio 18

UPDATE copia_pelicula SET estado="ESTROPEADA", observacion="Rayado"
WHERE id_copia=101;

-- Ejercicio 19

DELETE FROM pelicula WHERE titulo="El Orfanato";

-- Ejercicio 20

INSERT INTO pelicula VALUES ("ESP", "Probando123", 118, 2020, "Acción", 3);

INSERT INTO copia_pelicula  VALUES (113, "FUNCIONA", null, "ESP");
INSERT INTO copia_pelicula  VALUES (114, "FUNCIONA", null, "ESP");

-- Ejercicio 21

DELETE FROM socio
WHERE num_socio IN (SELECT socio
                    FROM alquiler
                    WHERE fec_devolucion < "2014-12-01");


-- Ejercicio 22

UPDATE pelicula SET precio_alquiler = precio_alquiler + 0.20
WHERE codigo IN (SELECT pelicula
                 FROM copia_pelicula
                 GROUP BY pelicula
                 HAVING COUNT(*) >= 2);

-- Ejercicio 23

UPDATE pelicula SET precio_alquiler = precio_alquiler + 0.20
WHERE codigo IN (SELECT pelicula
                 FROM copia_pelicula
                 GROUP BY pelicula
                 HAVING COUNT(*) >= 2);



-- Ejerccio 24

DELETE FROM copia_pelicula
WHERE estado LIKE "ESTROPEADA" 
AND pelicula IN (SELECT codigo
                 FROM pelicula
                 WHERE titulo LIKE "FROZEN");
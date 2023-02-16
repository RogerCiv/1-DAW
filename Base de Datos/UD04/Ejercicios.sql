
-- Ejercicio 01
SELECT 5*10, 10-5, 10/5;

-- Ejercicio 02
SELECT 5*10 AS "Multiplicacion", 10-5 AS "Resta", 10/5 "Division";

-- Ejercicio 03

SELECT nombre, apellido1, apellido2 FROM asistente WHERE empresa="BK Programacion";

-- Ejercicio 04

SELECT * FROM sala ORDER BY capacidad DESC;

-- Ejercicio 05

SELECT * FROM asistente WHERE empresa = "BigSoft" ORDER BY fechaNac DESC;

-- Ejercicio 06

SELECT empresa, COUNT(*) AS "asistentes por empresa" FROM asistente GROUP BY empresa;

-- Ejercicio 07
SELECT nombre, apellido1, apellido2 FROM asistente ORDER BY apellido1  LIMIT 5;


-- Ejercicio 08

SELECT tema,fecha FROM conferencia WHERE turno = 'T' AND sala IN ("Apolo", "Zeus");

-- Ejercicio 09
SELECT * FROM asistente  WHERE apellido1 LIKE "M%R%";

-- Ejercicio 10
SELECT * FROM conferencia WHERE (precio BETWEEN 12 AND 19) AND tema NOT IN ("Programacion web");

-- Ejercicio 11

SELECT nombre,fechaNac, CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos" 
FROM asistente  WHERE fechaNac BETWEEN "1974/01/01" AND "1985/01/01/" 
ORDER BY fechaNac DESC;

-- Ejercicio 12

SELECT * FROM conferencia WHERE tema LIKE "Programacion%" ORDER BY precio DESC;

-- Ejercicio 13

SELECT tema,precio, precio AS "Descuento 0%", ROUND(precio-precio*0.05,2) AS "Descuento 5%", 
ROUND(precio-precio*0.1,2) AS "Descuento 10%", ROUND(precio-precio*0.15,2) AS "Descuento 15%", 
ROUND(precio-precio*0.20,2) AS "Descuento 20%" FROM conferencia;


-- Ejercicio 14

SELECT tema,  DATE_FORMAT(fecha,"%d/%m/%y") AS fecha, precio, ROUND(precio-precio*0.5,2) AS "Descuento 5%" 
FROM conferencia ORDER BY precio DESC;

-- Ejercicio 15

SELECT UPPER(codigo) AS "Codigo", UPPER(nombre) AS "Nombre", CONCAT_WS(" ",UPPER(apellido1), UPPER(apellido2)) AS "Apellidos", UPPER(especialidad) AS "especialidad"
FROm ponente ORDER BY apellidos ;

-- EJercicio 16

/*SELECT UPPER(codigo) AS "Codigo", UPPER(nombre) AS "Nombre", 
CONCAT_WS(" ",UPPER(apellido1), UPPER(apellido2)) AS "Apellidos", 
NVL(apellido2,"***"), UPPER(especialidad) AS "especialidad" 
FROM ponente ORDER BY apellidos;
*/
SELECT UPPER(codigo) AS "Codigo", UPPER(nombre) AS "Nombre", CONCAT_WS(" ",UPPER(apellido1), 
UPPER(NVL(apellido2,"***"))) AS "Apellidos", UPPER(especialidad) AS "especialidad"
 FROM ponente ORDER BY apellidos;

-- Ejercicio 17
/*
SELECT UPPER(codigo) AS "Codigo",UPPER(RPAD(nombre,10,"*") ) AS "Nombre", CONCAT_WS(" ",UPPER(RPAD(apellido1,10,"*")), 
UPPER(RPAD(apellido2,10,"*"))) AS "Apellidos", NVL(apellido2,"***"), 
UPPER(especialidad) AS "especialidad" 
FROM ponente ORDER BY apellidos;
*/
SELECT UPPER(codigo) AS "Codigo",UPPER(RPAD(nombre,10,"*") ) AS "Nombre",
 CONCAT_WS(" ",UPPER(RPAD(apellido1,10,"*")), UPPER(RPAD(NVL(apellido2,""),10,"*"))) AS "Apellidos", 
 UPPER(especialidad) AS "especialidad" 
 FROM ponente ORDER BY apellidos;

--Ejercicio 18

SELECT REPLACE(nombre,"José","Pepe") AS "Nombre", CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos", 
LENGTH(nombre) AS "Longitud Nombre", LENGTH(Apellido1) AS "Longitud Apellido1", 
LENGTH(apellido2) AS "Longitud Apellido2"
 FROM asistente;

-- VERSION MEJOR
SELECT REPLACE(nombre,"José","Pepe") AS "Nombre", CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos", 
CHAR_LENGTH(nombre) + CHAR_LENGTH(apellido1) + CHAR_LENGTH(apellido2) AS "Longitud"
 FROM asistente;


 -- Ejercicio 19
SELECT nombre, CONCAT_WS(" ",apellido1,apellido2) AS "apellidos" ,fechaNac,
 DATEDIFF(CURDATE(),fechaNac) AS "Dias vividos" 
FROM asistente;

-- Ejercicio 20
SELECT nombre, CONCAT_WS(" ",apellido1,apellido2) AS "apellidos" , DAYOFWEEK(fechaNac) AS "Dia Semana",
DAYOFYEAR(fechaNac) AS "Dia del año", WEEKOFYEAR(fechaNac) "Numero de la semana"
FROM asistente;
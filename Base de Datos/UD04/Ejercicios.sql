
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

SELECT tema,  DATE_FORMAT(fecha,"%d/%m/%y") AS fecha, precio, ROUND(precio*0.5,2) AS "Descuento 5%" 
FROM conferencia ORDER BY "Descuento 5%" DESC;

SELECT tema,  DATE_FORMAT(fecha,"%d/%m/%y") AS fecha, precio, 
FLOOR(precio-precio*0.5,2) AS "Descuento 5%" 
FROM conferencia ORDER BY "Descuento 5%" DESC;

-- Ejercicio 15

SELECT UPPER(codigo) AS "Codigo", UPPER(nombre) AS "Nombre", CONCAT_WS(" ",UPPER(apellido1),
 UPPER(apellido2)) AS "Apellidos", UPPER(especialidad) AS "especialidad"
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

-- Ejercicio 21

SELECT nombre,capacidad
FROM sala
WHERE capacidad >= 200;
SELECT COUNT(nombre) AS "numero salas con 200 o más"
 FROM sala WHERE capacidad >= 200;

-- Ejercicio 22
SELECT  AVG(gratificacion) AS "Media Gratificacion"
FROM participar;

-- Ejercicio 23
SELECT turno, COUNT(DISTINCT sala) FROM conferencia GROUP BY turno;

-- Ejercicio 24
SELECT turno, COUNT(DISTINCT sala) 
FROM conferencia 
WHERE sala !="Apolo" GROUP BY turno;

-- Ejercicio 25
SELECT turno, COUNT(DISTINCT sala) FROM conferencia WHERE turno ="M";

-- Ejercicio 26
SELECT sexo, COUNT(sexo) FROM asistente GROUP BY sexo;

-- Ejercicio 27
SELECT sexo, COUNT(sexo), NVL(empresa,"Sin empresa asignada") AS empresa
FROM asistente 
WHERE empresa IS NULL
GROUP BY sexo;

-- Ejercicio 28
SELECT sexo, COUNT(sexo), NVL(empresa,"Sin empresa asignada") AS empresa
FROM asistente 
WHERE sexo = "H"
GROUP BY empresa;

-- Ejerccio 29 -- conferencias
SELECT  referencia,tema, nombre, CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos"
FROM ponente 
JOIN participar ON (ponente.codigo=participar.codPonente)
JOIN conferencia ON (participar.refConferencia=conferencia.referencia);

-- conferencias 2
SELECT  conferencia.idConferencia,tema, nombre, CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos"
FROM ponente 
JOIN participa USING (idPonente)
JOIN conferencia USING (idConferencia);

-- Ejercicio 30
SELECT nombre, CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos"
FROM asistente
JOIN asistir ON (asistente.codigo=asistir.codAsistente)
WHERE referencia="PWB1314";

-- conferencias 2
SELECT nombre, apellido1, apellido2
FROM asistente
JOIN asiste USING (idAsistente)
WHERE idConferencia="PWB1314";

-- Ejercicio 31

SELECT tema,COUNT(*) AS "Total asistentes" 
FROM asistente
JOIN asistir ON (asistente.codigo=asistir.codAsistente)
JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
GROUP BY tema;
-- mas corto
SELECT tema,COUNT(*) AS "Total asistentes" 
FROM conferencia
JOIN asistir ON (asistir.refConferencia=conferencia.referencia)
GROUP BY tema;

-- conferencias 2
SELECT tema,COUNT(*) AS "Total asistentes"
FROM conferencia 
JOIN asiste USING(idConferencia)
GROUP BY tema;

-- Ejercicio 32
SELECT nombre, CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos",sala, tema, numOrden
FROM `ponente`
JOIN participar ON (ponente.codigo=participar.codPonente)
JOIN conferencia ON (participar.refConferencia=conferencia.referencia)
ORDER BY tema,numOrden;

-- conferencias 2
SELECT nombre, CONCAT_WS(" ",apellido1,apellido2) AS "Apellidos",nombreSala, tema, numOrden
FROM `ponente`
JOIN participa USING (idPonente)
JOIN conferencia USING (idConferencia)
ORDER BY tema,numOrden;
-- Ejercicio 33
SELECT tema,sala, COUNT(*) AS TotalAsistentes
FROM `asistir`
JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
GROUP BY tema, sala
ORDER BY TotalAsistentes DESC;

--conferencias 2
SELECT tema, sala, COUNT(*) AS TotalAsistentes
FROM asiste
JOIN conferencia USING (idConferencia)
GROUP BY tema, sala
ORDER BY TotalAsistentes DESC;

-- Ejercicio 34
SELECT DISTINCT nombre,apellido1,apellido2, conferencia.sala
FROM ponente
JOIN participar ON (ponente.codigo=participar.codPonente)
JOIN conferencia ON (participar.refConferencia=conferencia.referencia)
WHERE sala ="Afrodita";

-- conferencias 2
SELECT DISTINCT nombre,apellido1,apellido2, conferencia.sala
FROM ponente
JOIN participar USING (idPonente)
JOIN conferencia USING (idConferencia)
WHERE sala ="Afrodita";



-- Ejercicio EXTRA CLASE
-- Quiero conocer el nombre y apellidos de los asistentes que hayan asistido 
--a alguna conferencia que haya dado Kevin Schultz en la sala afrodita
-- ordenar los resultados por apellido y nombre

SELECT asistente.nombre, asistente.apellido1,asistente.apellido2, sala
FROM `asistente`
JOIN asistir ON (asistente.codigo=asistir.codAsistente)
JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
JOIN participar ON (conferencia.referencia=participar.refConferencia)
JOIN ponente ON (participar.codPonente=ponente.codigo)
WHERE ponente.nombre = "Kevin" AND sala="Apolo";

-- conferencias 2

SELECT asistente.nombre, asistente.apellido1,asistente.apellido2, nombreSala
FROM `asistente`
JOIN asiste USING (idAsistente)
JOIN conferencia USING (idConferencia)
JOIN participa USING (idConferencia)
JOIN ponente USING (idPonente)
WHERE ponente.nombre = "Kevin" AND nombreSala="Apolo";


-- Ejercicio 35

SELECT * 
FROM ponente
WHERE apellido1 IN (SELECT apellido1 
                    FROM asistente
                    WHERE fechaNac = (SELECT MAX(fechaNac)
                                        FROM asistente));

-- Ejercicio 36
SELECT ponente.*
FROM ponente JOIN participar ON (ponente.codigo=participar.codPonente)
JOIN conferencia ON (participar.refConferencia=conferencia.referencia)
WHERE sala IN (SELECT sala
    FROM conferencia WHERE sala = "Afrodita");

SELECT DISTINCT ponente.*
FROM ponente JOIN participar ON (ponente.codigo=participar.codPonente)
JOIN conferencia ON (participar.refConferencia=conferencia.referencia)
WHERE sala = "Afrodita";

-- LA MÁs Correcta
SELECT *
FROm ponente
WHERE codigo IN  (SELECT  codPonente
            FROM participar
            WHERE refConferencia IN (SELECT referencia
                                FROM conferencia
                    WHERE nombre="Afrodita"));

-- Ejercicio 37

SELECT nombre, apellido1, apellido2 , sexo, fechaNac, empresa
FROM asistente JOIN asistir ON (asistente.codigo=asistir.codAsistente)
    JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
WHERE empresa = "BigSoft" AND tema = "Programacion Web"

-- La correcta con subconsultas

SELECT *
FROM asistente
WHERE codigo IN (SELECT  codAsistente
                 FROM asistir JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
                WHERE tema = "Programacion web")
            AND  empresa = "BigSoft";

-- Lo mismo pero subconsultas más JOIN
SELECT *
FROM asistente
WHERE codigo IN (SELECT  codAsistente
                 FROM asistir 
                 WHERE refConferencia IN (SELECT referencia
                 FROM conferencia
                WHERE tema = "Programacion web"))
            AND  empresa = "BigSoft";

-- Ejercicio 38

SELECT *
FROM asistente JOIN asistir ON (asistente.codigo=asistir.codAsistente)
    JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
    WHERE sexo = 'H' AND fechaNac < ("1985/01/01") AND tema = "Programacion Web";

-- La buena con subconsultas
SELECT *
FROM asistente 
WHERE sexo = 'H' AND fechaNac < ("1985/01/01") 
AND asistente.codigo IN (SELECT codAsistente
            FROM asistir 
            WHERE refConferencia IN (SELECT referencia
            FROM conferencia
            WHERE tema = "Programacion Web"));


-- Ejercicio 39

SELECT  nombre, apellido1, apellido2 SUM(gratificacion) AS total
FROM ponente JOIN participar ON (ponente.codigo = participar.codPonente)
GROUP BY nombre,apellido1,apellido2


-- Ejercicio 40

SELECT asistente.*, fecha, tema
FROM asistente
JOIN asistir ON (asistente.codigo=asistir.codAsistente)
JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
WHERE fecha = "2013/10/02"
ORDER BY tema ,nombre,apellido1;

-- Con subconsultas
-- No se puede ordenar por tema
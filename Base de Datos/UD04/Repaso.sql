/*Realizar una consulta que muestre los asistentes de la empresa “BigSoft” que asisten a algunas de las sesiones
de la conferencia sobre “Programación Web”.*/


SELECT nombre,apellido1,apellido2
FROM asistente
WHERE codigo IN (SELECT codAsistente
                FROM asistir
                WHERE refConferencia IN (SELECT referencia
                                        FROM conferencia
                                        WHERE tema = 'Programacion Web'))
 AND empresa = 'BigSoft';

 /* Realizar una consulta que muestre los asistentes que sean hombres y hayan nacido antes del “01/01/1985”, y
además hayan asistido a una conferencia sobre “Programación Web”*/
SELECT nombre, apellido1, apellido2, fechaNac
FROM asistente
WHERE codigo IN (SELECT codAsistente
                 FROM asistir
                 WHERE refConferencia IN (SELECT referencia
                                         FROM conferencia
                                         WHERE tema = 'Programacion Web'))
AND sexo = 'H' AND fechaNac < '1985/01/01';


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

/*Realizar una consulta que devuelva el nombre de los clientes, el
código de pedido y los días de retraso de aquellos pedidos que
no han sido entregados a tiempo (fecha de entrega superior a
la fecha estimada y estado igual a entregado). Ordenar el
resultado por el código de pedido de forma ascendente.*/
SELECT nombre_cliente, pedido.codigo_pedido, DATEDIFF(fecha_entrega,fecha_esperada) AS retraso
FROM cliente JOIN pedido USING (id_cliente)
WHERE estado = 'Entregado' AND fecha_entrega > fecha_esperada;


/*Realizar una consulta que muestre el nombre de cada empleado
(aunque no tenga jefe), el nombre de su jefe y el nombre del jefe
de su jefe. En caso de no tener jefe debe mostrar el valor “SIN
JEFE”.*/
SELECT empleado.nombre, NVL(jefe.nombre,'Sin Jefe') AS "Nombre Jefe", NVL(SuperJefe.nombre,"Sin jefe") AS "Nombre jefe del jefe"
FROM empleado LEFT JOIN empleado AS jefe ON(jefe.id_empleado=empleado.id_empleado)
LEFT JOIN empleado AS SuperJefe ON(superJefe.id_empleado=jefe.id_empleado);


/* Realizar una consulta que muestre las diferentes gamas de producto que
ha comprado cada cliente (no se deben mostrar las filas duplicadas) cuya
fecha de pedido esté comprendida entre el “10/01/2009” y el
“15/05/2009”, y el estado sea “entregado”. Ordenar los resultados por el
nombre del cliente y la gama de forma ascendente. Limitar el listado a
los 10 primeros resultados.*/
SELECT DISTINCT(nombre_cliente), gama
FROM cliente JOIN pedido USING (id_cliente)
JOIN detalle_pedido USING (codigo_pedido)
JOIN producto USING (codigo_producto)
WHERE estado = "Entregado" AND fecha_pedido BETWEEN "2009/01/10" AND "2009/05/15"
ORDER BY nombre_cliente, gama;

/* Devolver un listado con los 20 productos más vendidos
junto al número total de unidades vendidas de aquellos
pedidos realizados entre el “01/04/2008” y el
“31/01/2009” cuyo estado se encuentre en entregado. El
listado se debe ordenar por el número total de unidades
vendidas de forma descendente.*/
SELECT nombre, SUM(cantidad) AS Total_vendidos
FROM producto
JOIN detalle_pedido USING (codigo_producto)
JOIN pedido USING (codigo_pedido)
WHERE fecha_pedido BETWEEN "2008/04/01" AND "2009/01/31"
AND estado = "Entregado"
GROUP BY nombre
ORDER BY Total_vendidos DESC
LIMIT 20;

/*
Sin hacer uso de subconsultas devolver un listado que muestre solamente
los empleados que no tienen un cliente asociado.
*/

SELECT nombre, CONCAT_WS(" ",apellido1,apellido2) AS Apellidos
FROM `empleado`
LEFT JOIN cliente ON(empleado.id_empleado=cliente.id_empleado_rep_ventas)
WHERE id_empleado_rep_ventas IS NULL;

/* Devolver el nombre del cliente con menor límite de crédito de la región de
“Barcelona” (no se puede utilizar LIMIT ni ORDER BY en la sentencia SELECT).*/
SELECT nombre_cliente
FROM cliente
WHERE limite_credito = (SELECT MIN(limite_credito)
                    FROM cliente
                       WHERE region = "Barcelona");


/*Devolver el nombre del producto del que se han vendido más unidades
(tener en cuenta que se tendrá que calcular cuál es el número total de
unidades que se han vendido de cada producto a partir de los datos de la
tabla detalle_pedido).*/

SELECT nombre
FROM producto
WHERE codigo_producto = (SELECT codigo_producto
                         FROM detalle_pedido
                         GROUP BY codigo_producto
                         ORDER BY SUM(cantidad) DESC
                         LIMIT 1);


/*
Devolver un listado con los nombres de los clientes que han realizado algún
pedido pero no han realizado ningún pago. Ordenar el resultado por el nombre
de cliente de forma ascendente.
*/
SELECT DISTINCT nombre_cliente
FROM `pedido`
JOIN cliente USING (id_cliente)
 LEFT JOIN pago USING (id_cliente)
WHERE pago.id_cliente IS NULL
ORDER BY nombre_cliente;

/*Obtener el total facturado por producto (únicamente se deben
tener en cuenta los pedidos realizados en el año 2009 y que se
encuentren en estado de entregados para el cálculo) del cliente
que tiene menor límite de crédito.
*/
SELECT nombre, SUM(detalle_pedido.cantidad * detalle_pedido.precio_unidad) AS "Total Facturado"
FROM `cliente`
JOIN pedido USING (id_cliente)
JOIN detalle_pedido USING (codigo_pedido)
JOIN producto USING (codigo_producto)
WHERE limite_credito = (SELECT  MIN(limite_credito)
                        FROM cliente)
AND (fecha_pedido BETWEEN "2009/01/01" AND "2009/12/31") AND estado = "Entregado"
GROUP BY nombre;


/*
Obtener los productos de la gama “Ornamentales” que tengan un precio de
venta mayor o igual al de todos los productos de la gama “Frutales” (no se
puede utilizar las funciones MAX y MIN, ni la cláusula ORDER BY)
*/

SELECT DISTINCT nombre
FROM producto
WHERE gama = "Ornamentales" 
AND precio_venta >= ALL ( SELECT precio_venta
                         FROM producto 
                         WHERE gama = "Frutales"
                        );




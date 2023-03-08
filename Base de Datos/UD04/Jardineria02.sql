-- Ejercicio 01
/*
Realizar una consulta que devuelva el nombre de los clientes, el
código de pedido y los días de retraso de aquellos pedidos que
no han sido entregados a tiempo (fecha de entrega superior a
la fecha estimada y estado igual a entregado). Ordenar el
resultado por el código de pedido de forma ascendente.
*/

SELECT nombre_cliente, codigo_pedido, DATEDIFF(fecha_entrega,fecha_esperada) AS dias_retraso
FROM cliente JOIN pedido USING (id_cliente)
WHERE fecha_entrega > fecha_esperada AND estado = "entregado"
GROUP BY codigo_pedido ;

-- Ejercicio 02

/*
Realizar una consulta que muestre el nombre de cada empleado
(aunque no tenga jefe), el nombre de su jefe y el nombre del jefe
de su jefe. En caso de no tener jefe debe mostrar el valor “SIN
JEFE”.***Usar LEFT JOIN
*/


SELECT empleado.nombre , NVL(Jefe.nombre,"SIN JEFE") AS "nombre jefe", NVL(SuperJefe.nombre,"SIN JEFE") AS "Jefe del Jefe"
FROM empleado LEFT JOIN empleado AS Jefe ON (Jefe.id_empleado=empleado.id_jefe)
LEFT JOIN empleado AS SuperJefe ON (SuperJefe.id_empleado=Jefe.id_jefe);

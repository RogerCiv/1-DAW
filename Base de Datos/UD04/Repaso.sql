SELECT nombre_cliente, limite_credito, linea_direccion2, NVL(region,"SIN REGION") AS region
FROM `cliente`
WHERE limite_credito BETWEEN 5000 AND 10000 
AND linea_direccion2 IS NULL
AND nombre_cliente LIKE "_a%"
ORDER BY nombre_cliente DESC
LIMIT 1,5;


/*Quiero obtener un listado con las gamas de productos que no tienen ningun producto asociado*/
SELECT DISTINCT gama
FROM gama_producto LEFT JOIN producto USING (gama)
WHERE codigo_producto IS NULL;

SELECT gama 
FROM gama_producto 
WHERE gama NOT IN (SELECT gama 
               FROM producto);


SELECT gama FROM gama_producto 
EXCEPT
SELECT gama FROM producto;


/*Listado de los clientes que hayan pedido algun producto de los que el stock sea máximo!*/
SELECT DISTINCT nombre_cliente
FROM cliente
JOIN pedido USING (id_cliente)
JOIN detalle_pedido USING (codigo_pedido)
WHERE codigo_producto IN (SELECT codigo_producto
                          FROM producto
                         WHERE cantidad_en_stock = (SELECT MAX(cantidad_en_stock)
                                                              FROM producto));


SELECT nombre_cliente
FROM cliente
WHERE id_cliente IN (SELECT id_cliente
                     FROM pedido
                     WHERE codigo_pedido IN (SELECT codigo_pedido
                                              FROM detalle_pedido
                                              WHERE codigo_producto IN (SELECT codigo_producto
                                                                        FROM producto
                                                                        WHERE cantidad_en_stock = (SELECT MAX(cantidad_en_stock)
                                                                                                   FROM producto))))
ORDER BY nombre_cliente;


/* Nombre cliente cuyo representante de ventas tiene la oficina en madrid y es el que mas compra de la gama "Herramientas"*/
SELECT nombre_cliente
FROM cliente
WHERE id_empleado_rep_ventas IN (SELECT id_empleado 
                                 FROM empleado JOIN oficina USING (codigo_oficina)
                                 WHERE ciudad= "Madrid")
      AND id_cliente IN (SELECT id_cliente
                         FROM pedidio JOIN detalle_pedido USING (codigo_pedidio)
                         			JOIN producto USING (codigo_producto)
                         WHERE gama="Herramientas" AND codigo_producto IN (SELECT MAX
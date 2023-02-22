-- Ejercicio 01
SELECT estado
FROM pedido GROUP BY estado DESC;

-- EJercicio 02
SELECT CONCAT_WS(" ",nombre, apellido1, NVL(apellido2," ")) AS "Empleado",email,puesto
FROM empleado
WHERE puesto = "Director oficina" AND codigo_oficina LIKE "%ES";

-- Ejercicio 03

SELECT nombre, gama, cantidad_en_stock AS "Cantidad en Stock"
 FROM producto
  WHERE descripcion IS NULL AND precio_venta > 4 
  ORDER BY nombre, cantidad_en_stock DESC 
  LIMIT 3,5;

-- Ejercicio 04
SELECT nombre, CONCAT(ROUND((precio_venta-precio_proveedor)*1.21,2),"€") AS beneficio
 FROM producto 
WHERE gama = "Frutales"
 ORDER BY ROUND((precio_venta-precio_proveedor)*1.21,2) DESC LIMIT 5;

-- Ejercicio 05

SELECT UPPER(RPAD(nombre,10,"#")) AS "nombre", CONCAT_WS(" ",UPPER(apellido1),UPPER(NVL(apellido2," "))) AS "Apellidos", puesto
 FROM empleado
  WHERE puesto NOT IN ("Representante Ventas","Director Oficina") AND apellido1 
  LIKE "_o%" ORDER BY puesto ASC;

  -- Ejercicio 06
SET @@lc_time_names = "es_ES";
  SELECT codigo_pedido,id_cliente,MONTHNAME(fecha_entrega) AS "MES", 
  DATE_FORMAT(fecha_esperada,"%d/%m/%y") AS "Fecha esperada",
   DATE_FORMAT(fecha_entrega,"%d/%m/%y") AS "Fecha entrega", comentarios 
   FROM pedido
    WHERE comentarios IS NOT NULL AND DATEDIFF(fecha_esperada,fecha_entrega) >2
     ORDER BY fecha_esperada DESC;

-- Ejercicio 07
SELECT id_cliente,SUM(total) AS total  
FROM pago 
WHERE fecha_pago BETWEEN "2008-01-01" AND "2008-12-31"
GROUP BY id_cliente
HAVING  SUM(total) >= 4000
ORDER BY total DESC;

-- Ejercicio 08
SELECT id_cliente,COUNT(*) AS 'pedidos_rechazados'
FROM pedido
WHERE fecha_pedido BETWEEN "2009-01-01" AND "2009-12-31"
AND estado IN ("Rechazado")
GROUP BY id_cliente, estado
ORDER BY pedidos_rechazados DESC;

-- Ejercicio 09
SELECT YEAR(fecha_pedido) AS año, MONTH(fecha_pedido) AS mes, COUNT(*) AS pedidos
FROM `pedido`
WHERE estado IN("Entregado") AND MONTH(fecha_pedido)= 1 AND comentarios IS NULL
GROUP BY año,mes;

-- Ejercicio 10
SELECT id_cliente, SUM(total) AS acumulado
FROM `pago`
WHERE forma_pago IN("PayPal") AND fecha_pago BETWEEN "2008-01-08" AND "2009-02-16"
GROUP BY id_cliente
HAVING SUM(total) BETWEEN 5000 AND 15000
ORDER BY SUM(total) DESC;

-- Ejercicio 11
SET @@lc_time_names = "es_ES";
SELECT id_cliente, 
DATE_FORMAT(MIN(fecha_pago),"%d de %b de %Y") AS "Ultimo pago",
DATE_FORMAT(MAX(fecha_pago),"%d de %b de %Y") AS "Primer pago"
FROM pago
GROUP BY id_cliente;

-- Ejercicio 12
SELECT codigo_producto AS producto,
ROUND(SUM(cantidad*precio_unidad),2) AS "Base imponible",
ROUND(SUM(cantidad*precio_unidad * 0.21),2) AS "21% IVA",
ROUND(SUM(cantidad*precio_unidad +(cantidad*precio_unidad * 0.21)),2) AS " Total",
FROM detalle_pedido
WHERE codigo_producto LIKE "OR%"
GROUP BY codigo_producto
HAVING Total > 200
ORDER BY Total DESC
LIMIT 5;
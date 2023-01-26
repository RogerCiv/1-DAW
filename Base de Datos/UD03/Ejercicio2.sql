-- Ejercicio 2

--apartado A
ALTER TABLE cliente ADD codigo_postal CHAR(5);

-- Apartado B
ALTER TABLE cliente DROP localidad;

-- Apartado C

ALTER TABLE transaccion CHANGE importe cantidad DECIMAL(13,2) 
NOT NULL CHECK (cantidad BETWEEN -9999999999.99 AND 9999999999.99);

-- Apartado D 

CREATE INDEX indiceCliente ON cliente (nombre);

-- Apartado E 

ALTER TABLE cliente ADD sexo ENUM('H','M','SI') NOT NULL;

-- Apartado F
ALTER TABLE cliente ADD telefono CHAR(12) NOT NULL;

-- Apartado G
ALTER DROP cliente_nueva DROP CONSTRAINT fkcliente_idcliente;
ALTER TABLE cliente_nueva ADD FOREIGN KEY (idCliente) REFERENCES cliente(idCliente)  ON UPDATE
 CASCADE;
-- Apartado H 
/*
No se puede, para quitar restricciones hay que quitar todas.
En este caso, he redefinido el campo telefono creandolo sin la restriccion NOT NULL;
*/
ALTER TABLE cliente ADD telefono CHAR(12);


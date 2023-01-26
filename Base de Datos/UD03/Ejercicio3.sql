
-- EJERCICIO 3

-- Apartado A)
CREATE ROLE direccion;
CREATE ROLE caja;

-- Apartado B)
GRANT SELECT, INSERT, UPDATE, DELETE ON banco.transaccion  TO caja;

GRANT SELECT ON banco.sucursal, banco.cuenta, banco.cliente_cuenta, banco.cliente TO caja;

-- Apartado C)
GRANT SELECT, INSERT, UPDATE, DELETE ON * TO direccion;


-- Apartado D)

CREATE USER pepe  IDENTIFIED BY "pepe";
GRANT direccion TO pepe;
SET DEFAULT ROLE direccion FOR pepe;

CREATE USER juan IDENTIFIED BY "juan";

GRANT  caja TO juan;
SET DEFAULT ROLE caja FOR juan;

-- Apartado E)

DROP ROLE direccion, caja ;

-- Se quedarian los usuarios creados, pero sin permisos y sin ROL.
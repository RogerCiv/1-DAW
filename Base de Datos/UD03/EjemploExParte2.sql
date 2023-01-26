CREATE DATABASE banco;

USE banco;


CREATE TABLE cliente (
    idCliente INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    dni CHAR(9) UNIQUE NOT NULL,
    nombre VARCHAR(50) UNIQUE NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    localidad VARCHAR(30),
    fechaNac DATE NOT NULL,
    sexo ENUM('H', 'M') NOT NULL
);

CREATE TABLE sucursal (
    idSucursal SMALLINT PRIMARY KEY CHECK (idSucursal BETWEEN 0 AND 9999),
    nombre VARCHAR(40),
    direccion VARCHAR(100),
    localidad VARCHAR(40)
);

CREATE TABLE cuenta (
    idSucursal SMALLINT CHECK (idSucursal BETWEEN 0 AND 9999),
    idCuenta  MEDIUMINT CHECK (idCuenta BETWEEN 0 AND 999999),
    PRIMARY KEY (idSucursal, idCuenta),
    FOREIGN KEY idSucursal REFERENCES sucursal(idSucursal)
);

CREATE TABLE transaccion (
    idSucursal SMALLINT CHECK (idSucursal BETWEEN 0 AND 9999),
    idCuenta  MEDIUMINT CHECK (idCuenta BETWEEN 0 AND 999999),
    numTransaccion MEDIUMINT NOT NULL,
    fecha DATE DEFAULT CURRENT_DATE,
    importe DECIMAL(13,2) NOT NULL CHECK (importe BETWEEN -9999999999.99 AND 9999999999.99),
    PRIMARY KEY (numTransaccion, idSucursal, idCuenta),
   -- FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal),
    FOREIGN KEY (idCuenta, idSucursal) REFERENCES cuenta (idCuenta, idSucursal) 
);

CREATE TABLE cliente_cuenta (
     idSucursal SMALLINT CHECK (idSucursal BETWEEN 0 AND 9999),
     idCuenta  MEDIUMINT CHECK (idCuenta BETWEEN 0 AND 999999),
     idCliente INT UNSIGNED AUTO_INCREMENT,
     PRIMARY KEY (idSucursal, idCuenta, idCliente),
     --FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal),
     FOREIGN KEY (idCuenta, idSucursal) REFERENCES cuenta(idCuenta, idSucursal),
     CONSTRAINT fkcliente_idcliente FOREIGN KEY (idCliente) REFERENCES cliente(idCliente)

);


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
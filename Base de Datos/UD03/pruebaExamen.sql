DROP DATABASE IF NOT EXISTS banco;
CREATE DATABASE banco COLLATE utf8mb4_spanish_ci;

USE banco;

CREATE TABLE cliente (
    idCliente INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DNI CHAR(9) UNIQUE NOT NULL,
    nombre VARCHAR(50) UNIQUE NOT NULL,
    direccion VARCHAR(100),
    localidad VARCHAR(50),
    fechaNac DATE,
    sexo ENUM("H","M")
);

CREATE TABLE sucursal (
    idSucursal SMALLINT UNSIGNED PRIMARY KEY CHECK ( idSucursal BETWEEN 0 AND 9999),
    nombre VARCHAR(50),
    direccion VARCHAR(100),
    localidad VARCHAR(40)
);

CREATE TABLE cuenta (
    idSucursal SMALLINT UNSIGNED  CHECK (idSucursal BETWEEN 0 AND 9999),
    idCuenta MEDIUMINT UNSIGNED CHECK (idCuenta BETWEEN 0 AND 999999),
    PRIMARY KEY (idSucursal,idCuenta),
    FOREIGN KEY (idSucursal) REFERENCES sucursal (idSucursal)
);

CREATE TABLE transaccion (
    idSucursal SMALLINT UNSIGNED  CHECK ( idSucursal BETWEEN 0 AND 9999),
    idCuenta MEDIUMINT UNSIGNED CHECk (idCuenta BETWEEN 0 AND 999999),
    numTransaccion MEDIUMINT NOT NULL,
    fecha CURRENT_DATE NOT NULL,
    importe DECIMAL(12,2) CHECK (importe BETWEEN -9999999999,99 AND 9999999999,99),
    PRIMARY KEY (idSucursal, idCuenta, numTransaccion),
    FOREIGN KEY (idSucursal,idCuenta) REFERENCES cuenta (idSucursal, idCuenta)
);

CREATE TABLE cliente_cuenta (
    idSucursal SMALLINT UNSIGNED  CHECK ( idSucursal BETWEEN 0 AND 9999),
    idCuenta MEDIUMINT UNSIGNED CHECk (idCuenta BETWEEN 0 AND 999999),
    idCliente INT UNSIGNED,
    PRIMARY KEY (idSucursal, idCuenta, idCliente),
    FOREIGN KEY (idSucursal,idCuenta) REFERENCES cuenta (idSucursal, idCuenta),
    FOREIGN KEY (idCliente) REFERENCES cliente (idCliente)
);

-- Ejercicio 2
ALTER TABLE cliente ADD codigo_postal CHAR(5) NOT NULL;
ALTER TABLE cliente DROP localidad;
ALTER TABLE transaccion CHANGE importe cantidad  DECIMAL(12,2) CHECK (importe BETWEEN -9999999999,99 AND 9999999999,99);

CREATE INDEX  indiceCliente ON  cliente(nombre);

ALTER TABLE cliente ADD sexo ENUM('H','M','SI') NOT NULL;

ALTER TABLE cliente ADD telefono VARCHAR(15) NOT NULL;
ALTER DROP cliente_nueva DROP FOREIGN KEY fkcliente_idcliente;
ALTER TABLE cliente_nueva ADD CONSTRAINT fkcliente_idcliente 
FOREIGN KEY (idCliente) REFERENCES cliente(idCliente)  ON UPDATE CASCADE;
/*
No se puede, para quitar restricciones hay que quitar todas.
En este caso, he redefinido el campo telefono creandolo sin la restriccion NOT NULL;
*/
ALTER TABLE cliente ADD telefono CHAR(12);


-- Ejercicio 3

CREATE ROLE direccion, caja;
GRANT SELECT, INSERT,UPDATE,DELETE ON banco.transaccion TO caja;
GRANT SELECT ON banco.sucursal, banco.cuenta, banco.cliente_cuenta, banco.cliente TO caja;

GRANT SELECT,INSERT,UPDATE,DELETE ON banco.* TO direccion;

GRANT direccion TO pepe IDENTIFIED BY 'pepe1234';
SET DEFAULT ROLE direccion FOR pepe;
GRANT caja TO juan IDENTIFIED BY 'juan1234';
SET DEFAULT ROLE caja FOR juan;
DROP ROLE direccion,caja;
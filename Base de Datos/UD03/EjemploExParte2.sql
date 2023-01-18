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
    FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal),
    FOREIGN KEY (idCuenta) REFERENCES cuenta (idCuenta) 
);

CREATE TABLE cliente_cuenta (
     idSucursal SMALLINT CHECK (idSucursal BETWEEN 0 AND 9999),
     idCuenta  MEDIUMINT CHECK (idCuenta BETWEEN 0 AND 999999),
     idCliente INT UNSIGNED AUTO_INCREMENT,
     PRIMARY KEY (idSucursal, idCuenta, idCliente),
     FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal),
     FOREIGN KEY (idCuenta) REFERENCES cuenta(idCuenta),
     FOREIGN KEY (idCliente) REFERENCES cliente(idCliente),

);


CREATE DATABASE Editorial COLLATE utf8mb4_spanish_c1;

USE Editorial;

CREATE TABLE sucursal(
    idSucursal SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(150),
    ciudad VARCHAR(40) NOT NULL,
    provincia VARCHAR(40) NOT NULL,
    telefono VARCHAR(15) UNSIGNED
);

CREATE TABLE periodista(
    idPeriodista SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nif CHAR(9) UNIQUE NOT NULL,
    nombre VARCHAR(50),
    apellido1 VARCHAR(50),
    apellido2 VARCHAR(50),
    telefono VARCHAR(15),
    especialidad VARCHAR(150)
);

CREATE TABLE revista (
    nRegistro SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(60) NOT NULL,
    tipo ENUM("Deportes", "Investigacion", " ACTUALIDAD"),
    periocidad ENUM("Semanal","Mensual","Quincenal") DEFAULT "Semanal"
);

CREATE TABLE empleado (
    idEmpleado SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nif CHAR(9) UNIQUE NOT NULL,
    nombre VARCHAR(50),
    apellido1 VARCHAR(50),
    apellido2 VARCHAR(50),
    telefono VARCHAR(15),
    idSucursal SMALLINT UNSIGNED AUTO_INCREMENT,
    FOREIGN KEY (idSucursal) REFERENCES sucursal (idSucursal)
);

CREATE TABLE seccion (
    titulo VARCHAR(70) NOT NULL,
    extension SMALLINT UNSIGNED NOT NULL,
    nRegistro SMALLINT UNSIGNED AUTO_INCREMENT,
    PRIMARY KEY (titulo,nRegistro),
    FOREIGN KEY (nRegistro) REFERENCES revista (nRegistro)
);

CREATE TABLE ejemplar (
    fecha DATE NOT NULL,
    nPaginas SMALLINT UNSIGNED NOT NULL,
    nEjemplares INT UNSIGNED NOT NULL,
    nRegistro SMALLINT UNSIGNED AUTO_INCREMENT,
    PRIMARY KEY (fecha, nRegistro),
    FOREIGN KEY (nRegistro) REFERENCES revista (nRegistro)
);

CREATE TABLE publica (
    idSucursal SMALLINT UNSIGNED AUTO_INCREMENT,
    nRegistro SMALLINT UNSIGNED AUTO_INCREMENT,
    PRIMARY KEY (idSucursal, nRegistro),
    FOREIGN KEY (idSucursal) REFERENCES sucursal (idSucursal),
    FOREIGN KEY (nRegistro) REFERENCES revista (nRegistro)
);

CREATE TABLE escribe (
    idPeriodista SMALLINT UNSIGNED AUTO_INCREMENT,
    nRegistro SMALLINT UNSIGNED AUTO_INCREMENT,
    PRIMARY KEY (idPeriodista, nRegistro),
    FOREIGN KEY (idPeriodista) REFERENCES periodista(idPeriodista),
    FOREIGN KEY (idRevista) REFERENCES revista (nRegistro)
);
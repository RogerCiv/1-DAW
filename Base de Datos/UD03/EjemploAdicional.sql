CREATE DATABASE  biblioteca CHARACTER SET utf8  COLLATE utf8mb4_spanish_ci;

USE biblioteca;

CREATE TABLE autor (
    idAutor CHAR(6) PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    apellido VARCHAR(100),
    fechaNacimiento DATE NOT NULL
);

CREATE TABLE libro (
    ISBN CHAR(17) PRIMARY KEY,
    numeroPagina SMALLINT UNSIGNED,
    nombre VARCHAR(40) NOT NULL,
    tematica VARCHAR(30) NOT NULL
);

CREATE TABLE escribir (
    idAutor CHAR(6),
    ISBN CHAR(17),
    PRIMARY KEY (idAutor, ISBN),
    FOREIGN KEY (ISBN) REFERENCES libro(ISBN),
    FOREIGN KEY (idAutor) REFERENCES autor(idAutor)
);


CREATE TABLE ejemplar (
    idEjemplar INT UNSIGNED,
    estadoConservacion VARCHAR(70) NOT NULL,
    localizacion VARCHAR(50) NOT NULL,
    ISBN CHAR(17),
    PRIMARY KEY (idEjemplar, ISBN)
    FOREIGN KEY (ISBN) REFERENCES libro(ISBN)
);

CREATE TABLE usuario (
    idUsuario SMALLINT UNSIGNED PRIMARY KEY,
    nif CHAR(9) UNIQUE NOT NULL,
    nombre VARCHAR(40),
    apellido VARCHAR(40) NOT NULL,
    direccion VARCHAR(100),
    telefono CHAR(13) NOT NULL
);

CREATE TABLE prestar (
    idUsuario SMALLINT UNSIGNED,
    idEjemplar INT UNSIGNED,
    ISBN CHAR(17)
    fechaPrestamo DATE  ,
    fechaDevolucion DATE,
    PRIMARY KEY (idUsuario, idEjemplar, ISBN, fechaPrestamo), 
    FOREIGN KEY (idUsuario) REFERENCES usuario(idUsuario),
    FOREIGN KEY (idEjemplar,ISBN) REFERENCES ejemplar(idEjemplar, ISBN),
    
);
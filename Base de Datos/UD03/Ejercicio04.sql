CREATE DATABASE  centro --CHARACTER SET utf8  COLLATE utf8mb4_spanish_ci;

USE centro;
-- APARTADO A del ejercicio 4
CREATE TABLE profesor(
    nif CHAR(9) PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    telefono CHAR(15),
    sueldo DECIMAL(6,2) CHECK (sueldo BETWEEN 1500 AND 2000),
    especialidad VARCHAR(20),
    fecha_alta DATE
);
CREATE TABLE modulo (
    codigo CHAR(5) PRIMARY KEY -- UNSIGNED AUTO_INCREMENT ,
    nombre VARCHAR(30) NOT NULL,
    descripcion VARCHAR(200),
    horas SMALLINT CHECK (horas BETWEEN 0 AND 300),
    NIF_profesor CHAR(9) NOT NULL,
    FOREIGN KEY (NIF_profesor) REFERENCES profesor(nif)
);

CREATE TABLE alumno (
    num_expediente CHAR(6) PRIMARY KEY,
    nif CHAR(9) UNIQUE NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellidos VARCHAR(100), 
    domicilio VARCHAR(100),
    poblacion VARCHAR(40),
    cod_postal CHAR(5) UNSIGNED,
    provincia VARCHAR(40),
    telefono CHAR(15),
    sexo ENUM('H','M') DEFAULT 'H',
    fec_nacimiento DATE NOT NULL
);

CREATE TABLE matricula (
    expediente_alumno CHAR(6),
    cod_modulo CHAR(5),
    curso_escolar YEAR,
    nota DECIMAL(4,2) UNSIGNED,
    PRIMARY KEY (expediente_alumno, cod_modulo, curso_escolar),
    FOREIGN KEY (expediente_alumno) REFERENCES alumno(num_expediente),
    FOREIGN KEY (cod_modulo) REFERENCES modulo(codigo)
);

-- APARTADO B 

ALTER TABLE profesor  MODIFY sueldo DECIMAL(4,2);

ALTER TABLE modulo DROP descripcion;

ALTER TABLE profesor ADD cargo VARCHAR(50);

ALTER TABLE matricula MODIFY nota CHECK (nota BETWEEN 0 AND 10);

RENAME TABLE modulo TO  asignatura;

ALTER TABLE profesor CHANGE sueldo salario DECIMAL(4,2);

-- No
ALTER TABLE alumno  MODIFY sexo CHECK ( sexo = 'H' OR sexo = 'M');
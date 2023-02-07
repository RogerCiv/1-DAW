DROP DATABASE IF EXISTS proyectos;
CREATE DATABASE proyectos COLLATE utf8mb4_spanish_ci;
USE proyectos;

CREATE TABLE profesor (
    idProfesor SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    despacho VARCHAR(10),
    telefono VARCHAR(15) NOT NULL,
    tipo ENUM("DOCTOR", "NO DOCTOR") NOT NULL DEFAULT "DOCTOR"
);

CREATE TABLE publicacion (
    idPublicacion SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    tipo ENUM("REVISTA", "CONGRESO")
);

CREATE TABLE revista (
    idRevista SMALLINT UNSIGNED PRIMARY KEY,
    volumen SMALLINT UNSIGNED,
    numero SMALLINT UNSIGNED NOT NULL,
    paginaIni SMALLINT UNSIGNED NOT NULL,
    paginaFin SMALLINT UNSIGNED NOT NULL CHECK (paginaFin>=paginaIni),
    FOREIGN KEY (idRevista) REFERENCES publicacion (idPublicacion)
);

CREATE TABLE congreso (
    idCongreso SMALLINT UNSIGNED PRIMARY KEY,
    tipo VARCHAR(50),
    ciudad VARCHAR(40),
    pais VARCHAR(40),
    paginaIni SMALLINT UNSIGNED NOT NULL,
    paginaFin SMALLINT UNSIGNED NOT NULL CHECK (paginaFin>=paginaIni),
    FOREIGN KEY (idCongreso) REFERENCES publicacion (idPublicacion)
);

CREATE TABLE proyecto (
    idProyecto SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    programa VARCHAR(120),
    descripcion VARCHAR(150),
    fechaIni DATE NOT NULL,
    fechaFin DATE NOT NULL CHECK (fechaFin >= fechaIni),
    presupuesto INT UNSIGNED NOT NULL,
    idDoctor SMALLINT UNSIGNED,
    FOREIGN KEY (idDoctor) REFERENCES profesor(idProfesor)
);
CREATE TABLE trabaja (
    idProfesor  SMALLINT UNSIGNED,
    idProyecto SMALLINT UNSIGNED,
    fechaIni DATE NOT NULL,
    fechaFin DATE NOT NULL CHECK (fechaFin >= fechaIni),
    PRIMARY KEY (idProfesor,idProyecto,fechaIni,fechaFin),
    FOREIGN KEY (idProfesor)  REFERENCES profesor (idProfesor),
    FOREIGN KEY (idProyecto) REFERENCES proyecto (idProyecto)
);

CREATE TABLE supervisa (
    idDoctor SMALLINT UNSIGNED,
    idNoDoctor SMALLINT UNSIGNED,
    fechaIni DATE NOT NULL,
    fechaFin DATE NOT NULL CHECK (fechaFin >= fechaIni),
    PRIMARY KEY (idDoctor,idNoDoctor,fechaIni,fechaFin),
    FOREIGN KEY (idDoctor,idNoDoctor) REFERENCES profesor(idProfesor)
);

CREATE TABLE escribe (
    idProfesor SMALLINT UNSIGNED,
    idPublicacion SMALLINT UNSIGNED,
    PRIMARY KEY (idProfesor, idPublicacion),
    FOREIGN KEY (idProfesor) REFERENCES profesor (idProfesor),
    FOREIGN KEY (idPublicacion) REFERENCES publicacion (idPublicacion)
);

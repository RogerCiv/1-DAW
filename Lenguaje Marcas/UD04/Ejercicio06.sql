
-- Apartado A)

CREATE DATABASE hotel;

USE hotel;

CREATE TABLE reserva (
    idReserva INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    descripcion VARCHAR(100) NOT NULL
);

--CREATE USER pepe IDENTIFIED BY 'pepe1234';
 GRANT  USAGE ON hotel.* TO pepe IDENTIFIED BY 'pepe1234';


-- Apartado B)

-- Nada, solo puede entrar. unicamente tiene permiso de conexion.
-- No se le ha asignado ningun ROL. 

-- Apartado C)

CREATE ROLE usuariosHotel;

GRANT UPDATE, INSERT, DELETE ON hotel.* TO usuariosHotel;

-- Apartado D)

CREATE USER juan ;

GRANT usuariosHotel TO juan;

-- Apartado E)

REVOKE UPDATE,INSERT, DELETE ON hotel FROM usuariosHotel;
GRANT SELECT ON hotel.* TO usuariosHotel;

-- No se puede porque solo tiene permiso para CONSULTAR
-- Con root si, porque tiene todos los permisos.

-- Apartado F)

 DROP ROLE usuariosHotel;

 -- Se queda sin ningun permiso.


# Programacion2
Entrega de API con Eclipce
CREATE TABLE ejemplo2.usuario ( id BIGINT NOT NULL AUTO_INCREMENT , nombre VARCHAR(40) NULL DEFAULT NULL , apellido VARCHAR(40) NULL DEFAULT NULL , telefono VARCHAR(40) NULL DEFAULT NULL , email VARCHAR(255) NULL DEFAULT NULL , contraseña VARCHAR(40) NULL DEFAULT NULL , PRIMARY KEY (id)) ENGINE = InnoDB;
CREATE TABLE ejemplo2.personal ( id BIGINT NOT NULL AUTO_INCREMENT , nombre VARCHAR(40) NULL DEFAULT NULL , apellido VARCHAR(40) NULL DEFAULT NULL , telefono VARCHAR(40) NULL DEFAULT NULL , email VARCHAR(255) NULL DEFAULT NULL , contraseña VARCHAR(40) NULL DEFAULT NULL, rol VARCHAR(40) NULL DEFAULT NULL , PRIMARY KEY (id)) ENGINE = InnoDB;
DROP TABLE areas;
DROP TABLE proyectos_integradores;
DROP TABLE grupos;
DROP TABLE alumnos;
DROP TABLE participantes;

CREATE TABLE areas(
id_area INTEGER PRIMARY KEY AUTOINCREMENT,
nombre VARCHAR2 NOT NULL,
descripcion VARCHAR2
);

CREATE TABLE proyectos_integradores(
id_proyecto INTEGER PRIMARY KEY AUTOINCREMENT,
nombre VARCHAR2 NOT NULL,
url VARCHAR2,
nota INTEGER NOT NULL,
anio INTEGER NOT NULL,
grupo VARCHAR2 NOT NULL,
id_area INTEGER,
FOREIGN KEY (id_area) REFERENCES areas (id_area),
FOREIGN KEY (grupo) REFERENCES grupos (grupo)
);

CREATE TABLE grupos(
grupo VARCHAR2 PRIMARY KEY,
curso VARCHAR2 NOT NULL
);

CREATE TABLE alumnos(
id_alumno INTEGER PRIMARY KEY AUTOINCREMENT,
nombre VARCHAR2 NOT NULL,
apellidos VARCHAR2 NOT NULL,
expediente VARCHAR2
);

CREATE TABLE participantes(
id_alumno INTEGER,
id_proyecto INTEGER,
PRIMARY KEY(id_alumno, id_proyecto),
FOREIGN KEY (id_alumno) REFERENCES alumnos (id_alumno),
FOREIGN KEY (id_proyecto) REFERENCES proyectos_integradores (id_proyecto)
);

INSERT INTO areas (nombre, descripcion) VALUES ('DAM','Desarrollo de Aplicaciones Multiplataformas');
INSERT INTO areas (nombre, descripcion) VALUES ('ASIR','Administración de Sistemas Informáticos de Redes');
INSERT INTO areas (nombre, descripcion) VALUES ('DAW','Digital Audio Workstation');
INSERT INTO areas (nombre) VALUES ('Animaciones 3d, Juegos y Entornos Interactivos');

INSERT INTO alumnos (nombre, apellidos) VALUES ('Alicia','García');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Amelia','Baños');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Berta','Rogrígez');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Ben','Ortín');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Celia','Liebana');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Carlos','García');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Diego','Valenti');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Diana','Echiberria');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Elena','Llavero');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Eugenio','Ernesto');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Felipe','Gonzalez');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Gonzalo','Leguina');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Helena','Sánchez');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Iñigo','Llavero');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Juan','Carlos');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Julián','Brian');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Lucia','Alonso');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Lucas','Alvarez');
INSERT INTO alumnos (nombre, apellidos) VALUES ('Martin','Chicago');

INSERT INTO grupos VALUES ('M11','1');
INSERT INTO grupos VALUES ('M12','1');
INSERT INTO grupos VALUES ('M21','2');
INSERT INTO grupos VALUES ('M22','2');
INSERT INTO grupos VALUES ('T11','1');
INSERT INTO grupos VALUES ('T12','1');
INSERT INTO grupos VALUES ('T21','2');
INSERT INTO grupos VALUES ('T22','2');

INSERT INTO proyectos_integradores (nombre, url, nota, anio, grupo, id_area) VALUES('Aplicacion para Proyecto_integrado','https://github.com/proyectointegrador',8,2018,'M11',1);
INSERT INTO proyectos_integradores (nombre, url, nota, anio, grupo, id_area) VALUES('Diseño de servidores','https://github.com/holaservidor',9,2018,'M21',2);
INSERT INTO proyectos_integradores (nombre, url, nota, anio, grupo, id_area) VALUES('Almacenamiento de canciones','https://github.com/canciones',7,2018,'T21',3);
INSERT INTO proyectos_integradores (nombre, url, nota, anio, grupo, id_area) VALUES('Diseño de grabaciones','https://github.com/grabaciones',6,2018,'M22',3);
INSERT INTO proyectos_integradores (nombre, url, nota, anio, grupo, id_area) VALUES('Tiny Dino World III','https://github.com/artgames',7,2018,'T11',4);

INSERT INTO participantes VALUES (1,1);
INSERT INTO participantes VALUES (2,1);
INSERT INTO participantes VALUES (3,1);
INSERT INTO participantes VALUES (4,2);
INSERT INTO participantes VALUES (5,2);
INSERT INTO participantes VALUES (6,2);
INSERT INTO participantes VALUES (7,3);
INSERT INTO participantes VALUES (8,3);
INSERT INTO participantes VALUES (9,3);
INSERT INTO participantes VALUES (10,4);
INSERT INTO participantes VALUES (11,4);
INSERT INTO participantes VALUES (12,4);
INSERT INTO participantes VALUES (13,5);
INSERT INTO participantes VALUES (14,5);
INSERT INTO participantes VALUES (15,5);
INSERT INTO participantes VALUES (16,5);
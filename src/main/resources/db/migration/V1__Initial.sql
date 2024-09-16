CREATE SCHEMA IF NOT EXISTS factory
  AUTHORIZATION pds;

CREATE TABLE IF NOT EXISTS factory.abstract_vehiculo
(
  vin character varying(17) COLLATE pg_catalog."default" PRIMARY KEY,
  marca character varying(17) COLLATE pg_catalog."default" NOT NULL,
  modelo character varying(250) COLLATE pg_catalog."default" NOT NULL,
  anio smallint NOT NULL,
  color character varying(50) COLLATE pg_catalog."default" NOT NULL,
  chasis character varying(50) COLLATE pg_catalog."default" NOT NULL,
  placa character varying(50) COLLATE pg_catalog."default",
  ram character varying(50) COLLATE pg_catalog."default" NOT NULL,
  numero_ejes smallint NOT NULL,
  numero_asientos smallint NOT NULL,
  tipo_combustible character varying(25) COLLATE pg_catalog."default" NOT NULL,
  potencia smallint NOT NULL,
  unidad_potencia character varying(50) COLLATE pg_catalog."default" NOT NULL
);

CREATE TABLE IF NOT EXISTS factory.camion
(
  vin character varying(17) COLLATE pg_catalog."default" PRIMARY KEY,
  tipo_camion character varying(25) COLLATE pg_catalog."default" NOT NULL
) INHERITS (factory.abstract_vehiculo);

CREATE TABLE IF NOT EXISTS factory.camioneta
(
  vin character varying(17) COLLATE pg_catalog."default" PRIMARY KEY,
  tipo_camioneta character varying(25) COLLATE pg_catalog."default" NOT NULL
) INHERITS (factory.abstract_vehiculo);

CREATE TABLE IF NOT EXISTS factory.auto
(
    vin character varying(17) COLLATE pg_catalog."default" PRIMARY KEY,
  tipo_auto character varying(25) COLLATE pg_catalog."default" NOT NULL
) INHERITS (factory.abstract_vehiculo);


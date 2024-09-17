CREATE SCHEMA IF NOT EXISTS builder
  AUTHORIZATION pds;

CREATE TABLE IF NOT EXISTS builder.activo_fijo
(
  codigo character varying(10) COLLATE pg_catalog."default" PRIMARY KEY,
  nombre character varying(250) COLLATE pg_catalog."default" NOT NULL,
  precio numeric(8,2) NOT NULL,
  porcentaje_residual numeric(5,2),
  tipo_activo character varying(50) COLLATE pg_catalog."default",
  porcentaje_depreciacion numeric(5,2),
  es_depreciable boolean,
  numero_serie character varying(50) COLLATE pg_catalog."default",
  fecha_compra date,
  ubicacion_actual character varying(50) COLLATE pg_catalog."default"
);



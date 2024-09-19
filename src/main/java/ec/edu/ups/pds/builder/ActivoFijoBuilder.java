package ec.edu.ups.pds.builder;

import ec.edu.ups.pds.entity.builder.ActivoFijoEntity;

import java.util.Date;

public class ActivoFijoBuilder {
    private ActivoFijoEntity entity;

    public ActivoFijoBuilder(String codigo, String nombre, Double precio) {
        this.entity = new ActivoFijoEntity(codigo, nombre, precio);
    }

    public ActivoFijoBuilder porcentajeResidual(Double porcentajeResidual) {
        this.entity.setPorcentajeResidual(porcentajeResidual);
        return this;
    }

    public ActivoFijoBuilder tipoActivo(String tipoActivo) {
        this.entity.setTipoActivo(tipoActivo);
        return this;
    }

    public ActivoFijoBuilder porcentajeDepreciacion(Double porcentajeDepreciacion) {
        this.entity.setPorcentajeDepreciacion(porcentajeDepreciacion);
        return this;
    }

    public ActivoFijoBuilder esDepreciable(Boolean esDepreciable) {
        this.entity.setEsDepreciable(esDepreciable);
        return this;
    }

    public ActivoFijoBuilder numeroSerie(String numeroSerie) {
        this.entity.setNumeroSerie(numeroSerie);
        return this;
    }

    public ActivoFijoBuilder fechaCompra(Date fechaCompra) {
        this.entity.setFechaCompra(fechaCompra);
        return this;
    }

    public ActivoFijoBuilder ubicacionActual(String ubicacionActual) {
        this.entity.setUbicacionActual(ubicacionActual);
        return this;
    }

    public ActivoFijoEntity construir() {
        return entity;
    }

}

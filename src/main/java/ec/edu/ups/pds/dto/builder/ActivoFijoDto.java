package ec.edu.ups.pds.dto.builder;

import java.util.Date;

public class ActivoFijoDto {
    private String codigo;
    private String nombre;
    private Double precio;
    private Double porcentajeResidual;
    private String tipoActivo;
    private Double porcentajeDepreciacion;
    private Boolean esDepreciable;
    private String numeroSerie;
    private Date fechaCompra;
    private String ubicacionActual;

    public ActivoFijoDto(String codigo, String nombre, Double precio, Double porcentajeResidual, String tipoActivo,
                         Double porcentajeDepreciacion, Boolean esDepreciable, String numeroSerie, Date fechaCompra,
                         String ubicacionActual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.porcentajeResidual = porcentajeResidual;
        this.tipoActivo = tipoActivo;
        this.porcentajeDepreciacion = porcentajeDepreciacion;
        this.esDepreciable = esDepreciable;
        this.numeroSerie = numeroSerie;
        this.fechaCompra = fechaCompra;
        this.ubicacionActual = ubicacionActual;
    }

    public ActivoFijoDto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPorcentajeResidual() {
        return porcentajeResidual;
    }

    public void setPorcentajeResidual(Double porcentajeResidual) {
        this.porcentajeResidual = porcentajeResidual;
    }

    public String getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(String tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    public Double getPorcentajeDepreciacion() {
        return porcentajeDepreciacion;
    }

    public void setPorcentajeDepreciacion(Double porcentajeDepreciacion) {
        this.porcentajeDepreciacion = porcentajeDepreciacion;
    }

    public Boolean getEsDepreciable() {
        return esDepreciable;
    }

    public void setEsDepreciable(Boolean esDepreciable) {
        this.esDepreciable = esDepreciable;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }
}

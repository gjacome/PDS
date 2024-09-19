package ec.edu.ups.pds.entity.builder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "activo_fijo", schema = "builder")
public class ActivoFijoEntity {

    @Id
    @Column(name="codigo", nullable = false)
    private String codigo;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="precio", nullable = false)
    private Double precio;

    @Column(name="porcentaje_residual", nullable = true)
    private Double porcentajeResidual;

    @Column(name="tipo_activo", nullable = true)
    private String tipoActivo;

    @Column(name="porcentaje_depreciacion", nullable = true)
    private Double porcentajeDepreciacion;


    @Column(name="es_depreciable", nullable = true)
    private Boolean esDepreciable;

    @Column(name="numero_serie", nullable = true)
    private String numeroSerie;

    @Column(name="fecha_compra", nullable = true)
    private Date fechaCompra;

    @Column(name="ubicacion_actual", nullable = true)
    private String ubicacionActual;

    public ActivoFijoEntity() {
    }

    public ActivoFijoEntity(String codigo, String nombre, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
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

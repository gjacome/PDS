package ec.edu.ups.pds.entity.factory;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class VehiculoAbstract {
    @Id
    @Column(name="vin", nullable = false)
    private String vin;

    @Column(name="marca", nullable = false)
    private String marca;

    @Column(name="modelo", nullable = false)
    private String modelo;

    @Column(name="anio", nullable = false)
    private Short anio;

    @Column(name="color", nullable = false)
    private String color;

    @Column(name="chasis", nullable = false)
    private String chasis;

    @Column(name="placa", nullable = true)
    private String placa;

    @Column(name="ram", nullable = false)
    private String ram;

    @Column(name="numero_ejes", nullable = false)
    private Short numeroEjes;

    @Column(name="numero_asientos", nullable = false)
    private Short numeroAsientos;

    @Column(name="tipo_combustible", nullable = false)
    private String tipoCombustible;

    @Column(name="potencia", nullable = false)
    private Short potencia;

    @Column(name="unidad_potencia", nullable = false)
    private String unidadPotencia;

    public VehiculoAbstract(String vin, String marca, String modelo, Short anio, String color, String chasis, String placa,
                            String ram, Short numeroEjes, Short numeroAsientos, String tipoCombustible, Short potencia,
                            String unidadPotencia) {
        this.vin = vin;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.chasis = chasis;
        this.placa = placa;
        this.ram = ram;
        this.numeroEjes = numeroEjes;
        this.numeroAsientos = numeroAsientos;
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
        this.unidadPotencia = unidadPotencia;
    }

    public VehiculoAbstract() {

    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Short getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(Short numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public Short getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(Short numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Short getPotencia() {
        return potencia;
    }

    public void setPotencia(Short potencia) {
        this.potencia = potencia;
    }

    public String getUnidadPotencia() {
        return unidadPotencia;
    }

    public void setUnidadPotencia(String unidadPotencia) {
        this.unidadPotencia = unidadPotencia;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vin='" + vin + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                ", chasis='" + chasis + '\'' +
                ", placa='" + placa + '\'' +
                ", ram='" + ram + '\'' +
                ", numeroEjes=" + numeroEjes +
                ", numeroAsientos=" + numeroAsientos +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", potencia=" + potencia +
                ", unidadPotencia='" + unidadPotencia + '\'' +
                '}';
    }
}

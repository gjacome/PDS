package ec.edu.ups.pds.dto.factory;

import ec.edu.ups.pds.Enum.TipoVehiculo;
import ec.edu.ups.pds.modelo.entity.factory.AutoEntity;
import ec.edu.ups.pds.modelo.entity.factory.CamionEntity;
import ec.edu.ups.pds.modelo.entity.factory.CamionetaEntity;

public class VehiculoDTO {
    private String vin;
    private String marca;
    private String modelo;
    private Short anio;
    private String color;
    private String chasis;
    private String placa;
    private String ram;
    private Short numeroEjes;
    private Short numeroAsientos;
    private String tipoCombustible;
    private Short potencia;
    private String unidadPotencia;
    private String tipoEspecifico;
    private String tipoVehiculo;

    public VehiculoDTO() {
    }

    public VehiculoDTO(String vin, String marca, String modelo, Short anio, String color, String chasis, String placa,
                       String ram, Short numeroEjes, Short numeroAsientos, String tipoCombustible, Short potencia,
                       String unidadPotencia, String tipoEspecifico, String tipoVehiculo) {
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
        this.tipoEspecifico = tipoEspecifico;
        this.tipoVehiculo = tipoVehiculo;
    }

    public VehiculoDTO(AutoEntity entity) {
        this.vin = entity.getVin();
        this.marca = entity.getMarca();
        this.modelo = entity.getModelo();
        this.anio = entity.getAnio();
        this.color = entity.getColor();
        this.chasis = entity.getChasis();
        this.placa = entity.getPlaca();
        this.ram = entity.getRam();
        this.numeroEjes = entity.getNumeroEjes();
        this.numeroAsientos = entity.getNumeroAsientos();
        this.tipoCombustible = entity.getTipoCombustible();
        this.potencia = entity.getPotencia();
        this.unidadPotencia = entity.getUnidadPotencia();
        this.tipoEspecifico = entity.getTipoAuto();
        this.tipoVehiculo = TipoVehiculo.AUTO.toString();
    }

    public VehiculoDTO(CamionEntity entity) {
        this.vin = entity.getVin();
        this.marca = entity.getMarca();
        this.modelo = entity.getModelo();
        this.anio = entity.getAnio();
        this.color = entity.getColor();
        this.chasis = entity.getChasis();
        this.placa = entity.getPlaca();
        this.ram = entity.getRam();
        this.numeroEjes = entity.getNumeroEjes();
        this.numeroAsientos = entity.getNumeroAsientos();
        this.tipoCombustible = entity.getTipoCombustible();
        this.potencia = entity.getPotencia();
        this.unidadPotencia = entity.getUnidadPotencia();
        this.tipoEspecifico = entity.getTipoCamion();
        this.tipoVehiculo = TipoVehiculo.AUTO.toString();
    }

    public VehiculoDTO(CamionetaEntity entity) {
        this.vin = entity.getVin();
        this.marca = entity.getMarca();
        this.modelo = entity.getModelo();
        this.anio = entity.getAnio();
        this.color = entity.getColor();
        this.chasis = entity.getChasis();
        this.placa = entity.getPlaca();
        this.ram = entity.getRam();
        this.numeroEjes = entity.getNumeroEjes();
        this.numeroAsientos = entity.getNumeroAsientos();
        this.tipoCombustible = entity.getTipoCombustible();
        this.potencia = entity.getPotencia();
        this.unidadPotencia = entity.getUnidadPotencia();
        this.tipoEspecifico = entity.getTipoCamioneta();
        this.tipoVehiculo = TipoVehiculo.AUTO.toString();
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

    public String getTipoEspecifico() {
        return tipoEspecifico;
    }

    public void setTipoEspecifico(String tipoEspecifico) {
        this.tipoEspecifico = tipoEspecifico;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}

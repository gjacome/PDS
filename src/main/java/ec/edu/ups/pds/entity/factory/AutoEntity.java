package ec.edu.ups.pds.entity.factory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "auto", schema = "factory")
public class AutoEntity extends VehiculoAbstract {
    @Id
    @Column(name="vin", nullable = false)
    private String vin;

    @Column(name="tipo_auto", nullable = false)
    private String tipoAuto;

    public AutoEntity() {

    }

    public AutoEntity(String vin, String marca, String modelo, Short anio, String color, String chasis, String placa,
                      String ram, Short numeroEjes, Short numeroAsientos, String tipoCombustible, Short potencia,
                      String unidadPotencia, String tipoAuto) {
        super(vin,marca,modelo,anio,color,chasis,placa,ram,numeroEjes,numeroAsientos,tipoCombustible,potencia,unidadPotencia);
        this.vin = vin;
        this.tipoAuto = tipoAuto;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTipoAuto() {return tipoAuto;}

    public void setTipoAuto(String tipoAuto) {this.tipoAuto = tipoAuto;}

    @Override
    public String toString() {
        return super.toString() + "\n " +
                "Auto{" +
                "vin='" + vin + '\'' +
                ", tipoAuto='" + tipoAuto + '\'' +
                '}';
    }
}

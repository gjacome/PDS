package ec.edu.ups.pds.modelo.entity.factory;

import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "camion", schema = "factory")
public class CamionEntity extends VehiculoAbstract {
    @Id
    @Column(name="vin", nullable = false)
    private String vin;

    @Column(name="tipo_camion", nullable = false)
    private String tipoCamion;

    public CamionEntity() {

    }

    public CamionEntity(String vin, String marca, String modelo, Short anio, String color, String chasis, String placa,
                        String ram, Short numeroEjes, Short numeroAsientos, String tipoCombustible, Short potencia,
                        String unidadPotencia, String tipoCamion) {
        super(vin,marca,modelo,anio,color,chasis,placa,ram,numeroEjes,numeroAsientos,tipoCombustible,potencia,unidadPotencia);
        this.vin = vin;
        this.tipoCamion = tipoCamion;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTipoCamion() {return tipoCamion;}

    public void setTipoCamion(String tipoCamion) {this.tipoCamion = tipoCamion;}

    @Override
    public String toString() {
         return super.toString() + "\n " +
                 "Camion{" +
                "vin='" + vin + '\'' +
                ", tipoCamion='" + tipoCamion + '\'' +
                '}';
    }
}

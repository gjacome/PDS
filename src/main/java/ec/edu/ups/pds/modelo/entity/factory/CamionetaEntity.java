package ec.edu.ups.pds.modelo.entity.factory;

import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "camioneta", schema = "factory")
public class CamionetaEntity extends VehiculoAbstract {
    @Id
    @Column(name="vin", nullable = false)
    private String vin;

    @Column(name="tipo_camioneta", nullable = false)
    private String tipoCamioneta;

    public CamionetaEntity() {

    }

    public CamionetaEntity(String vin, String marca, String modelo, Short anio, String color, String chasis, String placa,
                           String ram, Short numeroEjes, Short numeroAsientos, String tipoCombustible, Short potencia,
                           String unidadPotencia, String tipoCamioneta) {
        super(vin,marca,modelo,anio,color,chasis,placa,ram,numeroEjes,numeroAsientos,tipoCombustible,potencia,unidadPotencia);
        this.vin = vin;
        this.tipoCamioneta = tipoCamioneta;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTipoCamioneta() {return tipoCamioneta;}

    public void setTipoCamioneta(String tipoCamioneta) {this.tipoCamioneta = tipoCamioneta;}

    @Override
    public String toString() {
        return super.toString() + "\n " +
                "Camioneta{" +
                "vin='" + vin + '\'' +
                ", tipoCamion='" + tipoCamioneta + '\'' +
                '}';
    }
}

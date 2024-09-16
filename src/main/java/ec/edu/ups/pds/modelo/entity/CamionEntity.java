package ec.edu.ups.pds.modelo.entity;

import ec.edu.ups.pds.dto.VehiculoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "camion", schema = "builder")
public class CamionEntity extends VehiculoAbstract {
    @Id
    @Column(name="vin", nullable = false)
    private String vin;

    @Column(name="tipo_camion", nullable = false)
    private String tipoCamion;

    public CamionEntity(String vin, String tipoCamion) {
        this.vin = vin;
        this.tipoCamion = tipoCamion;
    }

    public CamionEntity() {

    }

    public CamionEntity(VehiculoDTO dto) {
        super(dto.getVin(), dto.getMarca(), dto.getModelo(), dto.getAnio(), dto.getColor(), dto.getChasis(),
                dto.getPlaca(), dto.getRam(), dto.getNumeroEjes(), dto.getNumeroAsientos(), dto.getTipoCombustible(),
                dto.getPotencia(), dto.getUnidadPotencia());
        this.vin = dto.getVin();
        this.tipoCamion = dto.getTipoEspecifico();
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

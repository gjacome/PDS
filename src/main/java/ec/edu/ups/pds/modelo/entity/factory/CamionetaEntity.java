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

    public CamionetaEntity(VehiculoDTO dto) {
        super(dto.getVin(), dto.getMarca(), dto.getModelo(), dto.getAnio(), dto.getColor(), dto.getChasis(),
                dto.getPlaca(), dto.getRam(), dto.getNumeroEjes(), dto.getNumeroAsientos(), dto.getTipoCombustible(),
                dto.getPotencia(), dto.getUnidadPotencia());
        this.vin = dto.getVin();
        this.tipoCamioneta = dto.getTipoEspecifico();
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

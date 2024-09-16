package ec.edu.ups.pds.modelo.entity.factory;

import ec.edu.ups.pds.dto.factory.VehiculoDTO;
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

    public AutoEntity(VehiculoDTO dto) {
        super(dto.getVin(), dto.getMarca(), dto.getModelo(), dto.getAnio(), dto.getColor(), dto.getChasis(),
                dto.getPlaca(), dto.getRam(), dto.getNumeroEjes(), dto.getNumeroAsientos(), dto.getTipoCombustible(),
                dto.getPotencia(), dto.getUnidadPotencia());
        this.vin = dto.getVin();
        this.tipoAuto = dto.getTipoEspecifico();
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

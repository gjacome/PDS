package ec.edu.ups.pds.modelo.factory;

import ec.edu.ups.pds.Enum.TipoVehiculo;
import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import ec.edu.ups.pds.modelo.entity.factory.AutoEntity;
import ec.edu.ups.pds.modelo.entity.factory.CamionEntity;
import ec.edu.ups.pds.modelo.entity.factory.CamionetaEntity;
import ec.edu.ups.pds.modelo.entity.factory.VehiculoAbstract;

public class VehiculoFactory extends AbstractVehiculoFactory{
    @Override
    public VehiculoAbstract crearVehiculo(VehiculoDTO vehiculoDTO) {
        TipoVehiculo option = TipoVehiculo.valueOf(vehiculoDTO.getTipoVehiculo());
        switch (option) {
            case TipoVehiculo.AUTO:
                return new AutoEntity(vehiculoDTO);
            case TipoVehiculo.CAMION:
                return new CamionEntity(vehiculoDTO);
            case TipoVehiculo.CAMIONETA:
                return new CamionetaEntity(vehiculoDTO);
            default:
                throw new IllegalArgumentException("Tipo de vehiculo no valido");
        }


    }
}

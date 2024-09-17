package ec.edu.ups.pds.modelo.factory;

import ec.edu.ups.pds.Enum.TipoVehiculo;
import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import ec.edu.ups.pds.mapper.VehiculoMapper;
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
                return VehiculoMapper.getAutoEntity(vehiculoDTO);
            case TipoVehiculo.CAMION:
                return VehiculoMapper.getCamionEntity(vehiculoDTO);
            case TipoVehiculo.CAMIONETA:
                return VehiculoMapper.getCamionetaEntity(vehiculoDTO);
            default:
                throw new IllegalArgumentException("Tipo de vehiculo no valido");
        }


    }
}

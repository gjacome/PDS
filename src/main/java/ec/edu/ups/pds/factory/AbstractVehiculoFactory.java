package ec.edu.ups.pds.factory;

import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import ec.edu.ups.pds.entity.factory.VehiculoAbstract;

public abstract class AbstractVehiculoFactory {
    public abstract VehiculoAbstract crearVehiculo(VehiculoDTO vehiculoDTO);
}

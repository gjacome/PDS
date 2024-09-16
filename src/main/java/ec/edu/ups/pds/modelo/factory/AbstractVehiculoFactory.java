package ec.edu.ups.pds.modelo.factory;

import ec.edu.ups.pds.dto.VehiculoDTO;
import ec.edu.ups.pds.modelo.entity.VehiculoAbstract;

public abstract class AbstractVehiculoFactory {
    public abstract VehiculoAbstract crearVehiculo(VehiculoDTO vehiculoDTO);
}

package ec.edu.ups.pds.service.factory;

import ec.edu.ups.pds.dto.factory.VehiculoDTO;

import java.util.List;

public interface IVehiculoService {
    void guardar(VehiculoDTO vehiculoDTO);

    public List<VehiculoDTO> obtenerTodos();
}

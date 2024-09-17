package ec.edu.ups.pds.service.builder;

import ec.edu.ups.pds.dto.builder.ActivoFijoDto;

import java.util.List;

public interface IActivoFijoService {
    void guardar(ActivoFijoDto dto);

    List<ActivoFijoDto> obtenerTodos();
}

package ec.edu.ups.pds.mapper;

import ec.edu.ups.pds.dto.builder.ActivoFijoDto;
import ec.edu.ups.pds.modelo.entity.builder.ActivoFijoEntity;

public class ActivoFijoMapper {
    public static ActivoFijoDto getDto(ActivoFijoEntity entity){
        return new ActivoFijoDto(
                entity.getCodigo(),
                entity.getNombre(),
                entity.getPrecio(),
                entity.getPorcentajeResidual(),
                entity.getTipoActivo(),
                entity.getPorcentajeDepreciacion(),
                entity.getEsDepreciable(),
                entity.getNumeroSerie(),
                entity.getFechaCompra(),
                entity.getUbicacionActual()
        );
    }
}

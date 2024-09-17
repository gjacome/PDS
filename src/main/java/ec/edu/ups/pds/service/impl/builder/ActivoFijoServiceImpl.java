package ec.edu.ups.pds.service.impl.builder;

import ec.edu.ups.pds.dto.builder.ActivoFijoDto;
import ec.edu.ups.pds.mapper.ActivoFijoMapper;
import ec.edu.ups.pds.modelo.builder.ActivoFijoBuilder;
import ec.edu.ups.pds.modelo.entity.builder.ActivoFijoEntity;
import ec.edu.ups.pds.repository.builder.ActivoFijoRepository;
import ec.edu.ups.pds.service.builder.IActivoFijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivoFijoServiceImpl implements IActivoFijoService {
    @Autowired
    private ActivoFijoRepository activoFijoRepository;

    public void guardar(ActivoFijoDto dto) {
        ActivoFijoBuilder builder = new ActivoFijoBuilder(dto.getCodigo(), dto.getNombre(), dto.getPrecio());

        if (dto.getPorcentajeResidual() != null) {
            builder = builder.porcentajeResidual(dto.getPorcentajeResidual());
        }

        if (dto.getTipoActivo() != null) {
            builder = builder.tipoActivo(dto.getTipoActivo());
        }

        if (dto.getPorcentajeDepreciacion() != null) {
            builder = builder.porcentajeDepreciacion(dto.getPorcentajeDepreciacion());
        }

        if (dto.getEsDepreciable() != null) {
            builder = builder.esDepreciable(dto.getEsDepreciable());
        }

        if (dto.getNumeroSerie() != null) {
            builder = builder.numeroSerie(dto.getNumeroSerie());
        }

        if (dto.getFechaCompra() != null) {
            builder = builder.fechaCompra(dto.getFechaCompra());
        }

        if (dto.getUbicacionActual() != null) {
            builder = builder.ubicacionActual(dto.getUbicacionActual());
        }

        ActivoFijoEntity entity = builder.construir();
        activoFijoRepository.save(entity);
    }

    @Override
    public List<ActivoFijoDto> obtenerTodos() {
        List<ActivoFijoEntity> activos = activoFijoRepository.findAll();
        List<ActivoFijoDto> respuesta = new ArrayList<>();
        activos.forEach(activo -> {
            respuesta.add(ActivoFijoMapper.getDto(activo));
        });

        return respuesta;

    }
}

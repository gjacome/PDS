package ec.edu.ups.pds.service.impl.factory;

import ec.edu.ups.pds.Enum.TipoVehiculo;
import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import ec.edu.ups.pds.mapper.VehiculoMapper;
import ec.edu.ups.pds.modelo.entity.factory.AutoEntity;
import ec.edu.ups.pds.modelo.entity.factory.CamionEntity;
import ec.edu.ups.pds.modelo.entity.factory.CamionetaEntity;
import ec.edu.ups.pds.modelo.factory.VehiculoFactory;
import ec.edu.ups.pds.repository.factory.AutoRepository;
import ec.edu.ups.pds.repository.factory.CamionRepository;
import ec.edu.ups.pds.repository.factory.CamionetaRepository;
import ec.edu.ups.pds.service.factory.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VehiculoServiceImpl implements IVehiculoService {
    @Autowired
    private AutoRepository autoRepository;

    @Autowired
    private CamionetaRepository camionetaRepository;

    @Autowired
    private CamionRepository camionRepository;

    @Override
    public void guardar(VehiculoDTO vehiculoDTO) {
        var factory = new VehiculoFactory();
        var tipoVehiculo = TipoVehiculo.valueOf(vehiculoDTO.getTipoVehiculo());
        var entity =  factory.crearVehiculo(vehiculoDTO);
        switch (tipoVehiculo) {
            case AUTO:
                autoRepository.save((AutoEntity)entity);
                break;
            case CAMION:
                camionRepository.save((CamionEntity) entity);
                break;
            case CAMIONETA:
                camionetaRepository.save((CamionetaEntity) entity);
                break;
        }
    }

    @Override
    public List<VehiculoDTO> obtenerTodos() {
        List<AutoEntity> autos = autoRepository.findAll();
        List<CamionEntity> camiones = camionRepository.findAll();
        List<CamionetaEntity> camionetas = camionetaRepository.findAll();
        List<VehiculoDTO> respuesta = new ArrayList<>();

        autos.forEach(autoEntity -> respuesta.add(VehiculoMapper.getVehiculoDTO(autoEntity)));
        camiones.forEach(camionEntity -> respuesta.add(VehiculoMapper.getVehiculoDTO(camionEntity)));
        camionetas.forEach(camionetaEntity -> respuesta.add(VehiculoMapper.getVehiculoDTO(camionetaEntity)));

        return respuesta;

    }

    @Override
    public Double calcularCostoMatricula(String tipoVehiculo) {
        var opcion = TipoVehiculo.valueOf(tipoVehiculo);
        switch (opcion) {
            case AUTO:
                return 756.12;
            case CAMION:
                return 2408.66;
            case CAMIONETA:
                return 1352.48;
        }

        return 0.00;
    }

}

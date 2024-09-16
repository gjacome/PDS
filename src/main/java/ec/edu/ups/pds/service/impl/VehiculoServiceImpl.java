package ec.edu.ups.pds.service.impl;

import ec.edu.ups.pds.Enum.TipoVehiculo;
import ec.edu.ups.pds.dto.VehiculoDTO;
import ec.edu.ups.pds.modelo.entity.AutoEntity;
import ec.edu.ups.pds.modelo.entity.CamionEntity;
import ec.edu.ups.pds.modelo.entity.CamionetaEntity;
import ec.edu.ups.pds.modelo.factory.VehiculoFactory;
import ec.edu.ups.pds.repository.AutoRepository;
import ec.edu.ups.pds.repository.CamionRepository;
import ec.edu.ups.pds.repository.CamionetaRepository;
import ec.edu.ups.pds.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

}

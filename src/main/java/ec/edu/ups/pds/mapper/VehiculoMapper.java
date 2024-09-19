package ec.edu.ups.pds.mapper;

import ec.edu.ups.pds.Enum.TipoVehiculo;
import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import ec.edu.ups.pds.entity.factory.AutoEntity;
import ec.edu.ups.pds.entity.factory.CamionEntity;
import ec.edu.ups.pds.entity.factory.CamionetaEntity;

public class VehiculoMapper {
    public static VehiculoDTO getVehiculoDTO(AutoEntity entity) {
        return new VehiculoDTO(
                entity.getVin(),
                entity.getMarca(),
                entity.getModelo(),
                entity.getAnio(),
                entity.getColor(),
                entity.getChasis(),
                entity.getPlaca(),
                entity.getRam(),
                entity.getNumeroEjes(),
                entity.getNumeroAsientos(),
                entity.getTipoCombustible(),
                entity.getPotencia(),
                entity.getUnidadPotencia(),
                entity.getTipoAuto(),
                TipoVehiculo.AUTO.name()
        );
    }

    public static VehiculoDTO getVehiculoDTO(CamionEntity entity) {
        return new VehiculoDTO(
                entity.getVin(),
                entity.getMarca(),
                entity.getModelo(),
                entity.getAnio(),
                entity.getColor(),
                entity.getChasis(),
                entity.getPlaca(),
                entity.getRam(),
                entity.getNumeroEjes(),
                entity.getNumeroAsientos(),
                entity.getTipoCombustible(),
                entity.getPotencia(),
                entity.getUnidadPotencia(),
                entity.getTipoCamion(),
                TipoVehiculo.CAMION.name()
        );
    }

    public static VehiculoDTO getVehiculoDTO(CamionetaEntity entity) {
        return new VehiculoDTO(
                entity.getVin(),
                entity.getMarca(),
                entity.getModelo(),
                entity.getAnio(),
                entity.getColor(),
                entity.getChasis(),
                entity.getPlaca(),
                entity.getRam(),
                entity.getNumeroEjes(),
                entity.getNumeroAsientos(),
                entity.getTipoCombustible(),
                entity.getPotencia(),
                entity.getUnidadPotencia(),
                entity.getTipoCamioneta(),
                TipoVehiculo.CAMIONETA.name()
        );
    }

    public static AutoEntity getAutoEntity(VehiculoDTO dto) {
        return new AutoEntity(
                dto.getVin(),
                dto.getMarca(),
                dto.getModelo(),
                dto.getAnio(),
                dto.getColor(),
                dto.getChasis(),
                dto.getPlaca(),
                dto.getRam(),
                dto.getNumeroEjes(),
                dto.getNumeroAsientos(),
                dto.getTipoCombustible(),
                dto.getPotencia(),
                dto.getUnidadPotencia(),
                dto.getTipoEspecifico()
        );
    }

    public static CamionEntity getCamionEntity(VehiculoDTO dto) {
        return new CamionEntity(
                dto.getVin(),
                dto.getMarca(),
                dto.getModelo(),
                dto.getAnio(),
                dto.getColor(),
                dto.getChasis(),
                dto.getPlaca(),
                dto.getRam(),
                dto.getNumeroEjes(),
                dto.getNumeroAsientos(),
                dto.getTipoCombustible(),
                dto.getPotencia(),
                dto.getUnidadPotencia(),
                dto.getTipoEspecifico()
        );
    }

    public static CamionetaEntity getCamionetaEntity(VehiculoDTO dto) {
        return new CamionetaEntity(
                dto.getVin(),
                dto.getMarca(),
                dto.getModelo(),
                dto.getAnio(),
                dto.getColor(),
                dto.getChasis(),
                dto.getPlaca(),
                dto.getRam(),
                dto.getNumeroEjes(),
                dto.getNumeroAsientos(),
                dto.getTipoCombustible(),
                dto.getPotencia(),
                dto.getUnidadPotencia(),
                dto.getTipoEspecifico()
        );
    }
}

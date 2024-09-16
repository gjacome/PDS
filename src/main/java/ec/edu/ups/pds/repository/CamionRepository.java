package ec.edu.ups.pds.repository;

import ec.edu.ups.pds.modelo.entity.CamionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamionRepository extends JpaRepository<CamionEntity, String> {
}

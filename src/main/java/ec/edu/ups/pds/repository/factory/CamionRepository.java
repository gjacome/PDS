package ec.edu.ups.pds.repository.factory;

import ec.edu.ups.pds.entity.factory.CamionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamionRepository extends JpaRepository<CamionEntity, String> {
}

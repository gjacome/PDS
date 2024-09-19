package ec.edu.ups.pds.repository.factory;

import ec.edu.ups.pds.entity.factory.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<AutoEntity, String> {
}

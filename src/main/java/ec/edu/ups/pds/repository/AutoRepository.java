package ec.edu.ups.pds.repository;

import ec.edu.ups.pds.modelo.entity.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<AutoEntity, String> {
}

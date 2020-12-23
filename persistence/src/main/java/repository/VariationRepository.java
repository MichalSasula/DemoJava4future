package repository;

import entity.VariationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariationRepository extends JpaRepository<VariationEntity, Long> {
}

package ptst.productimpact.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptst.productimpact.model.domain.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {
}

package ptst.productimpact.sensor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptst.productimpact.sensor.entity.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {
}

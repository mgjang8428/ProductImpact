package ptst.productimpact.fixsensor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptst.productimpact.fixsensor.dto.GpsData;
import ptst.productimpact.fixsensor.entity.FixSensorData;
import ptst.productimpact.sensor.entity.Sensor;

@Repository
public interface FixSensorRepository extends JpaRepository<FixSensorData, Integer> {
    List<FixSensorData> findByDeviceNumberAndShockDetectIsTrue(int deviceNumber);
    List<FixSensorData> findByDeviceNumberAndOverturnDetectIsTrue(int deviceNumber);
    List<FixSensorData> findByDeviceNumberAndGpsStatsTrueOrderByRecordDateTime(int deviceNumber);
    FixSensorData findFirstByDeviceNumberAndGpsStatsTrueOrderByRecordDateTimeDesc(int deviceNumber);
    List<FixSensorData> findByDeviceNumberOrderByRecordDateTimeDesc(int deviceNumber);
    FixSensorData findFirstByDeviceNumberOrderByRecordDateTimeDesc(int deviceNumber);
}
package ptst.productimpact.sensor;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptst.productimpact.fixsensor.FixSensorService;
import ptst.productimpact.sensor.SensorRepository;
import ptst.productimpact.sensor.dto.ReceiveSensorDataDto;
import ptst.productimpact.sensor.entity.Sensor;

@Service
public class SensorService {
    @Autowired
    SensorRepository sensorRepository;
    @Autowired
    FixSensorService sensorService;

    public void saveSensorData(ReceiveSensorDataDto rsdd) {
        Sensor sensor = new Sensor();

        sensor.setDeviceNumber(rsdd.getNo());
        sensor.setRecordDateTime(LocalDateTime.now());
        sensor.setVibeValue(rsdd.isVibe());
        sensor.setGyroValueX(rsdd.getGyro_x());
        sensor.setGyroValueY(rsdd.getGyro_y());
        sensor.setGyroValueZ(rsdd.getGyro_z());
        sensor.setGpsStatus(rsdd.isGps_stat());
        sensor.setGpsValueLat(rsdd.getGps_lat());
        sensor.setGpsValueLng(rsdd.getGps_lng());

        sensorRepository.save(sensor);
        sensorService.saveFixSensorData(sensor);

    }
}

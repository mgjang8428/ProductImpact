package ptst.productimpact.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptst.productimpact.model.domain.Sensor;
import ptst.productimpact.model.domain.dto.ReceiveSensorDataDto;
import ptst.productimpact.model.repository.SensorRepository;

@Service
public class SensorService {
    @Autowired
    SensorRepository sensorRepository;

    public void saveSensorData(ReceiveSensorDataDto rsdd) {
        Sensor sensor = new Sensor(rsdd.getNo(), rsdd.isVibe(), rsdd.getGyro_x(), rsdd.getGyro_y(), rsdd.getGyro_z(), rsdd.isGps_stat(), rsdd.getGps_lat(), rsdd.getGps_lng());
        sensorRepository.save(sensor);
    }
}

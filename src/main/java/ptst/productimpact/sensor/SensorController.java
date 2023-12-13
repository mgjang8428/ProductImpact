package ptst.productimpact.sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptst.productimpact.sensor.dto.ReceiveSensorDataDto;
import ptst.productimpact.sensor.SensorService;

@RestController
@RequestMapping("/sensor")
public class SensorController {
    @Autowired
    SensorService sensorService;

    @PostMapping("/data")
    public String saveSensorData(@RequestBody ReceiveSensorDataDto rsdd){
        sensorService.saveSensorData(rsdd);
        return "OK";
    }
}

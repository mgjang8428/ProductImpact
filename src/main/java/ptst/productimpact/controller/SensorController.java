package ptst.productimpact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptst.productimpact.model.domain.dto.ReceiveSensorDataDto;
import ptst.productimpact.model.service.SensorService;

@RestController
@RequestMapping("/sensor")
public class SensorController {
    @Autowired
    SensorService sensorService;

    @PostMapping("/")
    public String saveSensorData(@RequestBody ReceiveSensorDataDto rsdd){
        sensorService.saveSensorData(rsdd);
        return "OK";
    }
}

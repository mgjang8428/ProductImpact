package ptst.productimpact.fixsensor;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ptst.productimpact.fixsensor.dto.GpsData;
import ptst.productimpact.product.ProductService;

@RestController
@RequestMapping("/fixdata")
public class FixSensorController {

    @Autowired
    FixSensorService fixSensorService;
    @Autowired
    ProductService productService;

    @GetMapping("/vibe/{productNum}")
    public int countVibeSensorValue(@PathVariable int productNum) {
        int deviceNumber = productService.findDeviceNumber(productNum);
        return fixSensorService.countVibeSensor(deviceNumber);
    }

    @GetMapping("/overturn/{productNum}")
    public int countOverturnValue(@PathVariable int productNum) {
        int deviceNumber = productService.findDeviceNumber(productNum);
        return fixSensorService.countOventurn(deviceNumber);
    }

    @GetMapping("/gpslist/{productNum}")
    public List<GpsData> getGpsDataByList(@PathVariable int productNum) {
        int deviceNumber = productService.findDeviceNumber(productNum);
        return fixSensorService.getGpsList(deviceNumber);
    }

    @GetMapping("/gpslatest/{productNum}")
    public GpsData getGpsDataByLatestOne(@PathVariable int productNum) {
        int deviceNumber = productService.findDeviceNumber(productNum);
        return fixSensorService.getGpsLatestOne(deviceNumber);
    }

    @GetMapping("/logs/{productNum}")
    public List<String> getLogs(@PathVariable int productNum) {
        int deviceNumber = productService.findDeviceNumber(productNum);
        return fixSensorService.makeLogs(deviceNumber);
    }

}

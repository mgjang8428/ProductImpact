package ptst.productimpact.carrier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptst.productimpact.carrier.dto.CarrierInfoDto;

@RestController
@RequestMapping("/carrier")
public class CarrierController {

    @Autowired
    CarrierService carrierService;

    @GetMapping("/info/{carrierNum}")
    public CarrierInfoDto getCarrierInfo(@PathVariable Long carrierNum) {
        CarrierInfoDto info = carrierService.getInfo(carrierNum);
        return info;
    }
}

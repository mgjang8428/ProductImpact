package ptst.productimpact.carrier;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptst.productimpact.carrier.dto.CarrierInfoDto;
import ptst.productimpact.carrier.entity.Carrier;

@Service
public class CarrierService {

    @Autowired
    CarrierRepository carrierRepository;
    public CarrierInfoDto getInfo(Long carrierNumber) {
        Optional<Carrier> carrier = carrierRepository.findById(carrierNumber);
        CarrierInfoDto result = new CarrierInfoDto(carrier.get().getName(), carrier.get().getPhoneNumber(), carrier.get().isStatus());
        return result;
    }
}

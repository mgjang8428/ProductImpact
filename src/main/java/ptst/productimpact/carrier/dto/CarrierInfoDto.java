package ptst.productimpact.carrier.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CarrierInfoDto {
    private String name;
    private String phoneNumber;
    private boolean status;

    public CarrierInfoDto(String name, String phoneNumber, boolean status) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }
}

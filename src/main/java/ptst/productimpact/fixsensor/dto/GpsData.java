package ptst.productimpact.fixsensor.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class GpsData {
    private double lat;
    private double lng;
    private LocalDateTime time;
}

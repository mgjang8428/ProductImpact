package ptst.productimpact.fixsensor.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FixSensorOne {
    private int vibeCount;
    private int overturnCount;
    private double lat;
    private double lng;
    private LocalDateTime leastDateTime;

    public FixSensorOne(int vibeCount, int overturnCount, double lat, double lng,
                        LocalDateTime leastDateTime) {
        this.vibeCount = vibeCount;
        this.overturnCount = overturnCount;
        this.lat = lat;
        this.lng = lng;
        this.leastDateTime = leastDateTime;
    }
}

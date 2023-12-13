package ptst.productimpact.sensor.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class ReceiveSensorDataDto {
    private int no;
    private boolean vibe;
    private int gyro_x;
    private int gyro_y;
    private int gyro_z;
    private boolean gps_stat;
    private double gps_lat;
    private double gps_lng;
}

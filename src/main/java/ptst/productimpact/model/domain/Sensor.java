package ptst.productimpact.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    private int deviceNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime recordDateTime;
    private boolean vibeValue;
    private int gyroValueX;
    private int gyroValueY;
    private int gyroValueZ;
    private boolean gpsStatus;
    private double gpsValueLat;
    private double gpsValueLng;

    public Sensor(int deviceNumber, boolean vibeValue, int gyroValueX, int gyroValueY, int gyroValueZ, boolean gpsStatus, double gpsValueLat, double gpsValueLng) {
        this.deviceNumber = deviceNumber;
        this.recordDateTime = LocalDateTime.now();
        this.vibeValue = vibeValue;
        this.gyroValueX = gyroValueX;
        this.gyroValueY = gyroValueY;
        this.gyroValueZ = gyroValueZ;
        this.gpsStatus = gpsStatus;
        this.gpsValueLat = gpsValueLat;
        this.gpsValueLng = gpsValueLng;
    }
}

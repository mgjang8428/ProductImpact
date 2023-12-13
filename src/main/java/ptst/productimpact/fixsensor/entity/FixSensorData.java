package ptst.productimpact.fixsensor.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter @Setter
public class FixSensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    private int deviceNumber;
    private int recordNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime recordDateTime;

    private boolean shockDetect;
    private boolean overturnDetect;

    private boolean gpsStats;
    private double gpsLat;
    private double gpsLng;
}

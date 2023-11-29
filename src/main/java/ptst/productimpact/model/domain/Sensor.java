package ptst.productimpact.model.domain;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    private int deviceNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDateTime;
    private int shockValue;
    private int accelValue;
    private int gpsValue;
}

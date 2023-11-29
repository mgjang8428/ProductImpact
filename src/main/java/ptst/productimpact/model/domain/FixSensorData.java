package ptst.productimpact.model.domain;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class FixSensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    @ManyToOne
    @JoinColumn(name = "DEVICE_NUMBER")
    private Device deviceNumber;
    private int recordNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDateTime;
    private boolean shockDetect;
    private boolean overturnDetect;
    private int gpsData;
}

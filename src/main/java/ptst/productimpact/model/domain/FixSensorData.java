package ptst.productimpact.model.domain;

import jakarta.persistence.*;
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
    private Date recordDateTime;
    private boolean shockDetect;
    private boolean overturnDetect;
    private int gpsData;
}

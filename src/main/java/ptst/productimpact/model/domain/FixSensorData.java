package ptst.productimpact.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class FixSensorData {
    @Id
    private int number;
    private int recordNumber;
    private Date recordDateTime;
    private boolean shockDetect;
    private boolean overturnDetect;
    private int gpsData;
}

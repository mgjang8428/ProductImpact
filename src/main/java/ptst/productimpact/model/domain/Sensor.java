package ptst.productimpact.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Sensor {
    @Id
    private int number;
    private int deviceNumber;
    private Date recordDateTime;
    private int shockValue;
    private int accelValue;
    private int gpsValue;
}

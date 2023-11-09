package ptst.productimpact.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Device {
    @Id
    private int number;
    private String model;
    private Date registDateTime;
    private Date lastConnectDateTime;
    private boolean assign;
    private boolean status;
}

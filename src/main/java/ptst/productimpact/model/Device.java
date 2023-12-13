package ptst.productimpact.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;
@Entity
@Getter @Setter
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    private String model;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastConnectDateTime;
    @ColumnDefault("false")
    private boolean assign;
    @ColumnDefault("true")
    private boolean status;
}

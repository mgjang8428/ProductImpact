package ptst.productimpact.model.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    private int clientNumber;
    private int carrierNumber;
    private int deviceNumber;
    private int invoiceNumber;
    private String recipient;
    private String receiveAddress;
    private String requestContent;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date completeDateTime;
    @ColumnDefault("true")
    private boolean status;
    @ColumnDefault("false")
    private boolean deliveryStatus;
    @ColumnDefault("false")
    private boolean completeStatus;
}

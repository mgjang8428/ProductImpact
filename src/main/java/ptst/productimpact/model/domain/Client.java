package ptst.productimpact.model.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CLIENT_NUM")
    private int number;
    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String pw;
    private String name;
    private String address;
    private String phoneNumber;
    @ColumnDefault("true")
    private boolean status;
}

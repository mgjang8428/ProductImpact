package ptst.productimpact.model.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String pw;
    private String name;
    private String phoneNumber;
    @ColumnDefault("true")
    private boolean status;
}

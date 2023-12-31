package ptst.productimpact.carrier.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter @Setter
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long number;
    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String pw;
    private String name;
    private String phoneNumber;
    @ColumnDefault("true")
    private boolean status;
}

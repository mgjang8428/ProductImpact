package ptst.productimpact.model.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int number;
    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String pw;
    private String name;
    @ColumnDefault("true")
    private boolean status;
}

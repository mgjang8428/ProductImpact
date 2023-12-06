package ptst.productimpact.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter @Setter
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

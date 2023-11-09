package ptst.productimpact.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    private int number;
    private String id;
    private String pw;
    private String name;
    private boolean status;
}

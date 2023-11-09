package ptst.productimpact.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    private int number;
    private String id;
    private String pw;
    private String name;
    private String address;
    private String phoneNumber;
    private boolean status;
}

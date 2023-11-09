package ptst.productimpact.model.domain;

import java.util.Date;

public class Product {
    private int number;
    private int clientNumber;
    private int carrierNumber;
    private int deviceNumber;
    private int invoiceNumber;
    private String recipient;
    private String receiveAddress;
    private String request;
    private Date startDateTime;
    private Date completeDateTime;
    private boolean status;
    private boolean deliveryStatus;
    private boolean completeStatus;
}

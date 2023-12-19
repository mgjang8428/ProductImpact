package ptst.productimpact.product.dto;

import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class ProductInfoDto {
    private int number;
    private int invoiceNumber;
    private String recipient;
    private String receiveAddress;
    private String requestContent;
    private Date startDateTime;
    private Date completeDateTime;
    private boolean status;
    private boolean deliveryStatus;
    private boolean completeStatus;

    public ProductInfoDto(int number, int invoiceNumber, String recipient, String receiveAddress, String requestContent,
                          Date startDateTime, Date completeDateTime, boolean status, boolean deliveryStatus,
                          boolean completeStatus) {
        this.number = number;
        this.invoiceNumber = invoiceNumber;
        this.recipient = recipient;
        this.receiveAddress = receiveAddress;
        this.requestContent = requestContent;
        this.startDateTime = startDateTime;
        this.completeDateTime = completeDateTime;
        this.status = status;
        this.deliveryStatus = deliveryStatus;
        this.completeStatus = completeStatus;
    }
}

package ptst.productimpact.product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductStateChangeDto {
    private int productNumber;
    private boolean deliveryState;
    private boolean completeState;
}

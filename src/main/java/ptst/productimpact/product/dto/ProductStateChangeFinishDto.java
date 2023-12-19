package ptst.productimpact.product.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class ProductStateChangeFinishDto {
    private int productNumber;
    private boolean productState;

    public ProductStateChangeFinishDto(int productNumber, boolean productState) {
        this.productNumber = productNumber;
        this.productState = productState;
    }
}

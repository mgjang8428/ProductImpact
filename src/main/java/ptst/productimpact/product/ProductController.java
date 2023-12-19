package ptst.productimpact.product;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptst.productimpact.product.dto.ProductInfoDto;
import ptst.productimpact.product.dto.ProductStateChangeDto;
import ptst.productimpact.product.dto.ProductStateChangeFinishDto;
import ptst.productimpact.product.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/info/{productNumber}")
    public Optional<Product> getProductInfo(@PathVariable int productNumber) {
        Optional<Product> info = productService.getProductInfo(productNumber);
        return info;
    }

    @GetMapping("/list/{carrierNum}")
    public List<ProductInfoDto> getProductList(@PathVariable int carrierNum) {
        List<ProductInfoDto> info = productService.getProductInfoList(carrierNum);
        return info;
    }

    @GetMapping("/client/list/{clientNum}")
    public List<ProductInfoDto> getClientProductList(@PathVariable int clientNum) {
        List<ProductInfoDto> info = productService.getClientProductInfoList(clientNum);
        return info;
    }

    @GetMapping("/invoice/{number}")
    public ProductInfoDto findInvoiceNum(@PathVariable int number) {
        ProductInfoDto info = productService.findInvoiceNumGetProductInfo(number);
        return info;
    }

    @PostMapping("/state")
    public String productStateChange(@RequestBody ProductStateChangeDto productStateChangeValue) {
        productService.updateProductState(productStateChangeValue);

        return "OK";
    }

    @PostMapping("/state/finish")
    public String productStateChange(@RequestBody ProductStateChangeFinishDto productStateChangeFinishValue) {
        productService.updateProductFinishState(productStateChangeFinishValue);

        return "OK";
    }
}

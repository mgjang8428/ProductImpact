package ptst.productimpact.product;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}

package ptst.productimpact.product;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptst.productimpact.product.entity.Product;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public int findDeviceNumber(int productNumber) {
        Optional<Product> product = productRepository.findById(1);
        return product.get().getDeviceNumber();
    }

    public Optional<Product> getProductInfo(int productNumber) {
        return productRepository.findById(productNumber);
    }
}

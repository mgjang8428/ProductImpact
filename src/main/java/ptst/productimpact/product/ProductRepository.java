package ptst.productimpact.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptst.productimpact.product.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

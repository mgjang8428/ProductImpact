package ptst.productimpact.product;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptst.productimpact.product.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCarrierNumberAndStatusTrue(int carrierNumber);

    List<Product> findByClientNumberAndStatusTrue(int clientNumber);

    Optional<Product> findByInvoiceNumber(int invoiceNumber);
}

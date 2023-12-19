package ptst.productimpact.carrier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptst.productimpact.carrier.entity.Carrier;
@Repository
public interface CarrierRepository extends JpaRepository<Carrier, Long> {
}

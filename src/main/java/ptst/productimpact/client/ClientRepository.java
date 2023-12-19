package ptst.productimpact.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptst.productimpact.client.entity.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}

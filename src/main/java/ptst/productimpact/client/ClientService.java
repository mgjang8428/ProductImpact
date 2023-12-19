package ptst.productimpact.client;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptst.productimpact.client.dto.ClientInfoDto;
import ptst.productimpact.client.entity.Client;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ClientInfoDto findClientInfo(int clientNum) {
        Optional<Client> data = clientRepository.findById(clientNum);
        Client info = data.get();
        ClientInfoDto result = new ClientInfoDto(info.getName(), info.getAddress(), info.getPhoneNumber());
        return result;
    }
}

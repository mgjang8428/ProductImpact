package ptst.productimpact.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptst.productimpact.client.dto.ClientInfoDto;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/info/{clientNum}")
    public ClientInfoDto getClientInfo(@PathVariable int clientNum) {
        return clientService.findClientInfo(clientNum);
    }
}
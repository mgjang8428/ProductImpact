package ptst.productimpact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServerStatusController {
    @GetMapping("/")
    public String serverStatus() {
        return "HELLOWORLD";
    }
}

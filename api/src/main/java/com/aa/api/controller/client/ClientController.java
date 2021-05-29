package com.aa.api.controller.client;

import com.aa.core.domain.Client;
import com.aa.core.port.driver.RegisterClientPort;
import com.aa.core.userstories.RegisterClientUS;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("/client")
public class ClientController {

    private RegisterClientPort registerClient = new RegisterClientUS();

    @PostMapping
    public Client registerClient(@RequestBody Client client){
        return registerClient.execute(client);
    }

}

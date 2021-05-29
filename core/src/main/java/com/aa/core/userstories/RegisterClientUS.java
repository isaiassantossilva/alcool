package com.aa.core.userstories;

import com.aa.core.domain.Client;
import com.aa.core.port.driver.RegisterClientPort;

import javax.inject.Named;

@Named
public class RegisterClientUS implements RegisterClientPort {
    @Override
    public Client execute(Client client) {
        System.out.println(client);
        return client;
    }
}

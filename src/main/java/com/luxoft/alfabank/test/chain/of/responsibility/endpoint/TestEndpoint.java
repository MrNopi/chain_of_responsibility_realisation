package com.luxoft.alfabank.test.chain.of.responsibility.endpoint;

import com.luxoft.alfabank.test.chain.of.responsibility.api.TestApi;
import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;
import com.luxoft.alfabank.test.chain.of.responsibility.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint implements TestApi {
    private TestService service;

    @Autowired
    public void setService(TestService service) {
        this.service = service;
    }

    @Override
    public ClientDto test(Long id) {
        return service.test(id);


    }
}

package com.luxoft.alfabank.test.chain.of.responsibility.service;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;
import com.luxoft.alfabank.test.chain.of.responsibility.pattern.chain.TestFilter;
import com.luxoft.alfabank.test.chain.of.responsibility.util.producer.ClientProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private TestFilter filter;

    @Autowired
    public void setFilter(TestFilter filter) {
        this.filter = filter;
    }

    public ClientDto test(Long id) {
        ClientDto dto = ClientProducer.create(id);
        if (dto.getCard() != null) {
            return filter.doFilter(dto);
        } else {
            return dto;
        }
    }
}

package com.luxoft.alfabank.test.chain.of.responsibility.pattern.chain;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;

public class MoreLimitRedFilter extends TestFilter {
    @Override
    public ClientDto doFilter(ClientDto clientDto) {
        clientDto.getCard().setLimit(30000d);
        clientDto.setAdvice("Advise you to get Cameleon card");
        return clientDto;
    }
}

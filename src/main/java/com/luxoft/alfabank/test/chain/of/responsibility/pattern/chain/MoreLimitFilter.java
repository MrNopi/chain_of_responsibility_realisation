package com.luxoft.alfabank.test.chain.of.responsibility.pattern.chain;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.Card;
import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;

public class MoreLimitFilter extends TestFilter {
    @Override
    public ClientDto doFilter(ClientDto clientDto) {
        Card card = clientDto.getCard();
        switch (card.getName()) {
            case "Cameleon":
                clientDto.setAdvice("Advise you to get a RED card");
                break;
            case "RED":
                filter = new MoreLimitRedFilter();
                break;
            default:
                clientDto.setAdvice("Advise you to get a RED or Cameleon card");
                break;
        }
        if (filter != null) {
            return filter.doFilter(clientDto);
        } else {
            return clientDto;
        }
    }
}

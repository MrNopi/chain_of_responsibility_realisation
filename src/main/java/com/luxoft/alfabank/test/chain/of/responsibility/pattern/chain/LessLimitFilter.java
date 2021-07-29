package com.luxoft.alfabank.test.chain.of.responsibility.pattern.chain;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.Card;
import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;

public class LessLimitFilter extends TestFilter {
    @Override
    public ClientDto doFilter(ClientDto clientDto) {
        Card card = clientDto.getCard();
        if (card.getName() == null) {
            throw new RuntimeException("No card name");
        }

        switch (card.getName().toLowerCase()) {
//            case "red":
//                clientDto.setAdvice("Advise to get Cameleon card");
//                break;
            case "cameleon":
                clientDto.setAdvice("Advise to get RED card");
                break;
            default:
                clientDto.setAdvice("Advise to get Cameleon card");
        }
        if (filter != null) {
            return filter.doFilter(clientDto);
        } else {
            return clientDto;
        }
    }
}

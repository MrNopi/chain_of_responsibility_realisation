package com.luxoft.alfabank.test.chain.of.responsibility.pattern.chain;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.Card;
import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;
import org.springframework.stereotype.Component;

@Component
public class LimitFilter extends TestFilter {
    @Override
    public ClientDto doFilter(ClientDto clientDto) {
        Card card = clientDto.getCard();
            if (card.getLimit() > 30000d) {
                filter = new MoreLimitFilter();
            } else {
                filter = new LessLimitFilter();
            }
            if (filter != null) {
                return filter.doFilter(clientDto);
            } else {
                return clientDto;
            }
    }
}

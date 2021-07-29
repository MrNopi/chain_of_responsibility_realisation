package com.luxoft.alfabank.test.chain.of.responsibility.util.producer;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.Card;
import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;

public class ClientProducer {
    public static ClientDto create(Long id) {
        int switcher = id.intValue();
        ClientDto clientDto = new ClientDto();
        clientDto.setId(id);
        Card card = new Card();
        clientDto.setCard(card);
        switch (switcher) {
            case 1:
                clientDto.setName("Jeremy");
                card.setName("RED");
                card.setNumber("7618 2731 2353 4534");
                card.setLimit(7000d);
                return clientDto;
            case 2:
                clientDto.setName("Antony");
                card.setName("Cameleon");
                card.setNumber("7618 2543 1121 3321");
                card.setLimit(320000d);
                return clientDto;
            case 3:
                clientDto.setName("Lepro");
                card.setName("Another card");
                card.setNumber("3333 3333 3333 3333");
                card.setLimit(32000d);
                return clientDto;
            case 4:
                clientDto.setName("Anatoliy");
                card.setName("RED");
                card.setNumber("1212 1212 1212 1212");
                card.setLimit(32000d);
                return clientDto;
            default:
                throw new RuntimeException("Unable to collect data");
        }
    }
}

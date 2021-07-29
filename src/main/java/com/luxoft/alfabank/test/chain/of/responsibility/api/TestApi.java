package com.luxoft.alfabank.test.chain.of.responsibility.api;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/chain")
public interface TestApi {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ClientDto test(@RequestParam Long id);
}

package com.luxoft.alfabank.test.chain.of.responsibility.pattern.chain;

import com.luxoft.alfabank.test.chain.of.responsibility.dto.ClientDto;

public abstract class TestFilter {
    TestFilter filter;
    public abstract ClientDto doFilter(ClientDto clientDto);
}

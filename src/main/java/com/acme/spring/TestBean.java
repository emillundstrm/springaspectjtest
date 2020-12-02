package com.acme.spring;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestBean {

    @Transactional
    public void run() {
        System.err.println("run()");
    }
}

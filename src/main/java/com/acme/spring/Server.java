package com.acme.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class Server {

    @Autowired
    private TestBean testBean;

    @Transactional
    public void init() {
        testBean.run();
    }

}

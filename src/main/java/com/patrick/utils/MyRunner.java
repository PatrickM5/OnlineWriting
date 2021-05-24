package com.patrick.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    InitData initData;

    @Override
    public void run(String... args) throws Exception {
        if(initData.initializeData()){
            logger.info("Data initialization complete ");
        }

    }
}
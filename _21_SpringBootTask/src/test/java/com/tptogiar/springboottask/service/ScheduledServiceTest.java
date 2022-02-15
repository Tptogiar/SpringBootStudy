package com.tptogiar.springboottask.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScheduledServiceTest {

    @Autowired
    AsyncService asyncService;

    @Test
    void hello() throws InterruptedException {


        Thread.sleep(10000);
    }
}
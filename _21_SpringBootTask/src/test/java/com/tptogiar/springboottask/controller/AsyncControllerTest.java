package com.tptogiar.springboottask.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AsyncControllerTest {

    @Autowired
    AsyncController asyncController;


    @Test
    void hello() throws InterruptedException {
        System.out.println(LocalDateTime.now());
        System.out.println("--------------");
        asyncController.hello();
        System.out.println("**************");
        System.out.println(LocalDateTime.now());
        Thread.sleep(4000);
    }
}
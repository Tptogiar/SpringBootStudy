package com.tptogiar.springbootconfig.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/1 - 12:36
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Initializr !";
    }




}

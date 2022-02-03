package com.tptogiar.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/3 - 16:20
 */
@RestController
public class HelloWorldController {


    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }


    @GetMapping("/tomcat.png")
    public String testStaticResourceAndController(){
        return "tomcat.png controller!";
    }



}

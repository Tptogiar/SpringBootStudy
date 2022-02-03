package com.tptogiar.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/3 - 16:20
 */
@Controller
public class HelloWorldController {




    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }


    @GetMapping("/tomcat.png")
    @ResponseBody
    public String testStaticResourceAndController(){
        return "tomcat.png controller!";
    }

    @GetMapping("/testThymeleaf")
    public String testThymeleaf(){
        return "index";
    }



}

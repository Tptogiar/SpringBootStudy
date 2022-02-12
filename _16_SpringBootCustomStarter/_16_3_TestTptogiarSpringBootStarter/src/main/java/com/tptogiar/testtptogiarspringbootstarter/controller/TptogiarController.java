package com.tptogiar.testtptogiarspringbootstarter.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.tptogiar.tptogiarspringbootstarterautoconfigurer.service.TptogiarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/12 - 15:37
 */
@RestController
public class TptogiarController {


    @Autowired
    TptogiarService tptogiarService;

    @GetMapping("/tptogiar")
    public String tptogiar(){
        return tptogiarService.doService("test");
    }


}

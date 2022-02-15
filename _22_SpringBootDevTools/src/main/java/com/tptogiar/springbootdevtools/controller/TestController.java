package com.tptogiar.springbootdevtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/16 - 0:58
 */
@Controller
public class TestController {


    @GetMapping("/ttt")
    public String test(){
        return "tset";
    }







}

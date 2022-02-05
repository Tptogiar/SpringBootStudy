package com.tptogiar.springbootcurd.controller;

import com.tptogiar.springbootcurd.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/5 - 21:49
 */

@Controller
public class TestExceptionController {


    @ResponseBody
    @RequestMapping("/testException")
    public  String testException(){
            throw new UserNotExistException();
    }


}

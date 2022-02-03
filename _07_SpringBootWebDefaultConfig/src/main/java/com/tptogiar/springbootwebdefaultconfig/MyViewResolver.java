package com.tptogiar.springbootwebdefaultconfig;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/3 - 19:54
 */
public class MyViewResolver implements ViewResolver {


    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return null;
    }
}

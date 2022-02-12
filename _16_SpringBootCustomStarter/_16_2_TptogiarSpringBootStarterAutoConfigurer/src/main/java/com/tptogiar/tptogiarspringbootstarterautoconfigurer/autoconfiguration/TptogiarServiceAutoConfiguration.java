package com.tptogiar.tptogiarspringbootstarterautoconfigurer.autoconfiguration;

import com.tptogiar.tptogiarspringbootstarterautoconfigurer.properties.TptogiarProperties;
import com.tptogiar.tptogiarspringbootstarterautoconfigurer.service.TptogiarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/12 - 15:23
 */
@Configuration
@ConditionalOnWebApplication//web应用才生效
@EnableConfigurationProperties(TptogiarProperties.class)
public class TptogiarServiceAutoConfiguration {

    @Autowired
    TptogiarProperties tptogiarProperties;

    @Bean
    public TptogiarService tptogiarService() {
        TptogiarService tptogiarService = new TptogiarService();
        tptogiarService.setTptogiarProperties(tptogiarProperties);
        return tptogiarService;
    }


}

package com.tptogiar.springbootconfig.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/1 - 14:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties("bird")
@PropertySource(value = {"classpath:bird.properties"})
public class Bird {

    @Value("bird.name")
    private String name;
}

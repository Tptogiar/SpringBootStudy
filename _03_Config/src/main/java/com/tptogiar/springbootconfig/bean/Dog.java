package com.tptogiar.springbootconfig.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/1 - 13:05
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Component
@PropertySource(value = {"classpath:dog.properties"})
@ConfigurationProperties("dog")
public class Dog {
    private String name;

    private Integer age;


}

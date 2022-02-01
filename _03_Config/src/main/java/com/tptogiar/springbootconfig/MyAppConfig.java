package com.tptogiar.springbootconfig;

import com.tptogiar.springbootconfig.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/1 - 14:49
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public Cat cat(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new Cat();
    }


}

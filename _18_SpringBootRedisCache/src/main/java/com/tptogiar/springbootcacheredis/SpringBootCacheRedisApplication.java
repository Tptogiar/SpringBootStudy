package com.tptogiar.springbootcacheredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@MapperScan(value = "com.tptogiar.springbootcacheredis.mapper")
@SpringBootApplication
@EnableCaching
public class SpringBootCacheRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCacheRedisApplication.class, args);
    }

}

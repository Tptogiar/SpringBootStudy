package com.tptogiar.springbootconfig;

import com.tptogiar.springbootconfig.bean.Bird;
import com.tptogiar.springbootconfig.bean.Cat;
import com.tptogiar.springbootconfig.bean.Dog;
import com.tptogiar.springbootconfig.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootMainTests {

    @Autowired
    ApplicationContext ioc;


    @Autowired
    private Person person;

    @Autowired
    private Dog dog;

    @Autowired
    private Bird bird;

    @Autowired
    private Cat cat;


    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(dog);
        System.out.println(bird);
        System.out.println(cat);
    }

}

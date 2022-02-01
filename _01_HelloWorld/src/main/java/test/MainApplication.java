package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/31 - 18:44
 */
@SpringBootApplication
public class MainApplication {

    //需要和controller在同一个包下
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }



}

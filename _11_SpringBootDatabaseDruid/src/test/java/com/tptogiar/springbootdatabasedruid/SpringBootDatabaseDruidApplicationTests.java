package com.tptogiar.springbootdatabasedruid;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class SpringBootDatabaseDruidApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DruidDataSource druidDataSource;
    @Test
    public void testDruid() throws SQLException {
        System.out.println(druidDataSource);
    }

}

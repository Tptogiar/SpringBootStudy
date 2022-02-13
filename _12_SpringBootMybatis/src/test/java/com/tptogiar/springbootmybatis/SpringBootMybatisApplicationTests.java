package com.tptogiar.springbootmybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.tptogiar.springbootmybatis.bean.Employee;
import com.tptogiar.springbootmybatis.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class SpringBootMybatisApplicationTests {


    @Autowired
    DruidDataSource druidDataSource;

    @Autowired
    EmployeeMapper employeeMapper;


    @Test
    public void testDruid() throws SQLException {
        System.out.println(druidDataSource);
    }


    @Test
    public void testMapper(){
        Employee empById = employeeMapper.getEmpById(1);
        System.out.println(empById);
    }


}

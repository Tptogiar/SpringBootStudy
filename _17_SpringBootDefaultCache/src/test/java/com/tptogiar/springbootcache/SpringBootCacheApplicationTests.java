package com.tptogiar.springbootcache;



import com.tptogiar.springbootcache.bean.Employee;
import com.tptogiar.springbootcache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class SpringBootCacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;



    @Test
    public void testMapper(){
        Employee empById = employeeMapper.getEmpById(1);
        System.out.println(empById);
    }



}

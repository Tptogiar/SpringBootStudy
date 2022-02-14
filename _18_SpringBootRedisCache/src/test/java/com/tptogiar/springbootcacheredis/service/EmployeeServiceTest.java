package com.tptogiar.springbootcacheredis.service;

import com.tptogiar.springbootcacheredis.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;


    @Test
    public void testGetEmp(){
        getEmp();
        getEmp();
    }





    @Test
    void getEmp() {
        System.out.println(employeeService.getEmp(1));
    }

    @Test
    void updateEmp() {
        Employee employee = new Employee(1, "sdf", 3, "234@@", 1);
        System.out.println(employeeService.updateEmp(employee));
    }

    @Test
    void deleteEmp() {
        employeeService.deleteEmp(1);
    }

    @Test
    void getEmpByLastName() {
        employeeService.getEmpByLastName("sdf");
    }
}
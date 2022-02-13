package com.tptogiar.springbootcache.controller;


import com.tptogiar.springbootcache.bean.Department;
import com.tptogiar.springbootcache.bean.Employee;
import com.tptogiar.springbootcache.mapper.DepartmentMapper;
import com.tptogiar.springbootcache.mapper.EmployeeMapper;
import com.tptogiar.springbootcache.service.DepartmentService;
import com.tptogiar.springbootcache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/12 - 11:53
 */
@Controller
public class DeptController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    EmployeeService employeeService;




    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/dept")
    @ResponseBody
    public Department insertDept(Department department){
        departmentService.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    @ResponseBody
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeService.getEmp(id);
    }


}

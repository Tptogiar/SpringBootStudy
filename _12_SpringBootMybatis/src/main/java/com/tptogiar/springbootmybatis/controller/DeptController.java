package com.tptogiar.springbootmybatis.controller;

import com.tptogiar.springbootmybatis.bean.Department;
import com.tptogiar.springbootmybatis.bean.Employee;
import com.tptogiar.springbootmybatis.mapper.DepartmentMapper;
import com.tptogiar.springbootmybatis.mapper.EmployeeMapper;
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
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    @ResponseBody
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    @ResponseBody
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }


}

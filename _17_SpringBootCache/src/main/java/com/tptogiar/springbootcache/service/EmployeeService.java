package com.tptogiar.springbootcache.service;

import com.tptogiar.springbootcache.bean.Employee;
import com.tptogiar.springbootcache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/14 - 1:10
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Cacheable(value ={"emp"} )
    public Employee getEmp(Integer id) {
        return employeeMapper.getEmpById(id);
    }
}

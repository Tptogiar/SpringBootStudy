package com.tptogiar.springbootcache.service;

import com.tptogiar.springbootcache.bean.Department;
import com.tptogiar.springbootcache.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/14 - 1:10
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;


    public int insertDept(Department department) {
        return departmentMapper.insertDept(department);
    }

    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDeptById(id);
    }
}

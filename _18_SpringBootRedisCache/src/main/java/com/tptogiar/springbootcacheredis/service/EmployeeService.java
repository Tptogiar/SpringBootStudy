package com.tptogiar.springbootcacheredis.service;


import com.tptogiar.springbootcacheredis.bean.Employee;
import com.tptogiar.springbootcacheredis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author Tptogiar
 * @description
 * @date 2022/2/14 - 1:10
 */
@Service
@CacheConfig(cacheNames="emp",cacheManager = "myCacheManager")
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Cacheable(value ={"emp"},
//            keyGenerator = "myKeyGenerator"
            key = "#id"
            /*,keyGenerator = "myKeyGenerator",condition = "#a0>1",unless = "#a0==2"*/
    )
    public Employee getEmp(Integer id) {
        System.out.println("---------------------"+"getEmp");
        return employeeMapper.getEmpById(id);
    }


    @CachePut(value = "emp",key = "#result.id")
    public Employee updateEmp(Employee employee){
        System.out.println("---------------------"+"updateEmp");
//        employeeMapper.updateEmp(employee);
        return employee;
    }


    @CacheEvict(value="emp",beforeInvocation = true/*key = "#id",*/)
    public void deleteEmp(Integer id){
        System.out.println("---------------------"+"deleteEmp");
//        employeeMapper.deleteEmpById(id);
        int i = 10/0;
    }


    @Caching(
            cacheable = {
                    @Cacheable(/*value="emp",*/key = "#lastName")
            },
            put = {
                    @CachePut(/*value="emp",*/key = "#result.id"),
                    @CachePut(/*value="emp",*/key = "#result.email")
            }
    )
    public Employee getEmpByLastName(String lastName){
        System.out.println("---------------------"+"getEmpByLastName");
        return null;
//        return employeeMapper.getEmpByLastName(lastName);
    }
}

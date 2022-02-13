package com.tptogiar.springbootcache.mapper;


import com.tptogiar.springbootcache.bean.Employee;

//@Mapper或者@MapperScan将接口扫描装配到容器中
//@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}

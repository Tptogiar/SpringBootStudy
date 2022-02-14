package com.tptogiar.springbootcacheredis.mapper;


import com.tptogiar.springbootcacheredis.bean.Employee;

//@Mapper或者@MapperScan将接口扫描装配到容器中
//@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}

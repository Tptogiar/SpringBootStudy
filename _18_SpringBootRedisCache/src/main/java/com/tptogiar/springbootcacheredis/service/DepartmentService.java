package com.tptogiar.springbootcacheredis.service;


import com.tptogiar.springbootcacheredis.bean.Department;
import com.tptogiar.springbootcacheredis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCacheManager;
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

    @Qualifier("myCacheManager")
    @Autowired
    RedisCacheManager myCacheManager;

    public int insertDept(Department department) {
        return departmentMapper.insertDept(department);
    }



    // 使用缓存管理器得到缓存，进行api调用
    public Department getDeptById(Integer id){
        System.out.println("查询部门"+id);
        Department department = departmentMapper.getDeptById(id);

        //获取某个缓存
        Cache dept = myCacheManager.getCache("dept");
        dept.put("dept:1",department);

        return department;
    }




}

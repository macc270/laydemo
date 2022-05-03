package com.example.laydemo.emp.service;

import com.example.laydemo.common.vo.EmpQuery;
import com.example.laydemo.emp.entity.Dept;
import com.example.laydemo.emp.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);

    List<Dept> getAllDept();

    void deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);
}

package com.example.laydemo.emp.mapper;

import com.example.laydemo.common.vo.EmpQuery;
import com.example.laydemo.emp.entity.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);

    void deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);
}

package com.example.laydemo.emp.mapper;

import com.example.laydemo.common.vo.EmpQuery;
import com.example.laydemo.emp.entity.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);
}

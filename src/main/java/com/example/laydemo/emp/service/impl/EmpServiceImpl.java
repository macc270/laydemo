package com.example.laydemo.emp.service.impl;

import com.example.laydemo.common.vo.EmpQuery;
import com.example.laydemo.emp.entity.Emp;
import com.example.laydemo.emp.mapper.EmpMapper;
import com.example.laydemo.emp.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;

    @Override
    public List<Emp> getEmpList(EmpQuery param) {
        return empMapper.getEmpList(param);
    }

    @Override
    public Long countEmpList(EmpQuery param) {
        return empMapper.countEmpList(param);
    }
}

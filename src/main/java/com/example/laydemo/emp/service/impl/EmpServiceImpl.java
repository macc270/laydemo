package com.example.laydemo.emp.service.impl;

import com.example.laydemo.common.vo.EmpQuery;
import com.example.laydemo.emp.entity.Dept;
import com.example.laydemo.emp.entity.Emp;
import com.example.laydemo.emp.mapper.DeptMapper;
import com.example.laydemo.emp.mapper.EmpMapper;
import com.example.laydemo.emp.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;
    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Emp> getEmpList(EmpQuery param) {
        return empMapper.getEmpList(param);
    }

    @Override
    public Long countEmpList(EmpQuery param) {
        return empMapper.countEmpList(param);
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }

    @Override
    public void deleteEmpByIds(String ids) {
        empMapper.deleteEmpByIds(ids);
    }

    @Override
    public Emp getEmpById(Integer id) {
        return empMapper.getEmpById(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }
}

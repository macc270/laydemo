package com.example.laydemo.emp.controller;

import com.example.laydemo.common.vo.EmpQuery;
import com.example.laydemo.common.vo.Result;
import com.example.laydemo.emp.entity.Emp;
import com.example.laydemo.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/list")
    public Result<Object> getEmpList(EmpQuery param) {
        List<Emp> list = empService.getEmpList(param);
        Long count = empService.countEmpList(param);
        return Result.success(list, count);
    }
}

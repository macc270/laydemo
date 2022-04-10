package com.example.laydemo.user.controller;


import com.example.laydemo.common.vo.Result;
import com.example.laydemo.user.entity.User;
import com.example.laydemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(User param, HttpSession session) {
        User user = userService.login(param);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("userInfo", user);
            return Result.success();
        }
        return Result.fail("用户名或密码错误！");
    }
}

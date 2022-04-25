package com.example.laydemo.common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //获取session，判断session用户信息是否存在
        Object user = request.getSession().getAttribute("userInfo");
        if (user == null) {
            //未登录
            log.debug("未登录请求：" + request.getRequestURI());
            try {
                response.sendRedirect(request.getContextPath() + "login");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
        log.debug("放行请求：" + request.getRequestURI());
        return true;
    }

}

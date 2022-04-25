package com.example.laydemo.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyWebConfig implements WebMvcConfigurer {
    @Autowired
    @Qualifier(value = "loginInterceptor")
    private HandlerInterceptor handlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(handlerInterceptor);
        //拦截请求
        registration.addPathPatterns("/**");
        //放行请求
        registration.excludePathPatterns(
                "/login" ,
                "/user/login" ,
                "/user/logout" ,
                "/layui/**",
                "/lib/**",
                "/webjars/**",
                "captcha");
    }

}
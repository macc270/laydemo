package com.example.laydemo.common.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotFoundController implements ErrorController {
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String error404() {
        return "error/404";
    }
}


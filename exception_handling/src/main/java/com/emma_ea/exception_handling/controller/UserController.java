package com.emma_ea.exception_handling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("add")
    public String add() {
        int num = 10 / 0;
        return "add";
    }

    @GetMapping("update")
    public String update() {
        String name = null;
        name = name.toString();
        return "update";
    }

}

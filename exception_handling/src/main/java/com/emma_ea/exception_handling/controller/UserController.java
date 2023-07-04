package com.emma_ea.exception_handling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("add")
    public String add() {
        int num = 10 / 0;
        return "add";
    }

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handleArithmeticError(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("mathError");
        return modelAndView;
    }

}

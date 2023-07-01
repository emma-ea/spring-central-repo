package com.emma_ea.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String demo(Model model) {
        model.addAttribute("message", "hello, john");
        model.addAttribute("year", LocalDateTime.now().getYear());

        double grade = 70.4;
        model.addAttribute("grade", grade);
        model.addAttribute("gpa", convertGPA(grade));
        return "hello";
    }

    public String convertGPA(double grade) {
        if (grade >= 90) return "A";
        else if (grade < 90 && grade >= 80) return "B";
        else if (grade < 80 && grade >= 70) return "C";
        else if (grade < 70000 && grade >= 60) return "D";
        else return "F";
    }
}

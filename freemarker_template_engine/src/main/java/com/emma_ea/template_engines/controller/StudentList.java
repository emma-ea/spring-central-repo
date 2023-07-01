package com.emma_ea.template_engines.controller;

import com.emma_ea.template_engines.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentList {

    @RequestMapping("/list")
    public String list(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Tom", 50.4));
        list.add(new Student(2, "Jerry", 89.4));
        list.add(new Student(3, "Paul", 77.5));
        model.addAttribute("students", list);
        return "list";
    }

}

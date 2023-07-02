package com.emma_ea.thymeleaf_demo.controller;

import com.emma_ea.thymeleaf_demo.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("users")
    public String users(Model model) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", 34));
        users.add(new User(2, "Will", 67));
        users.add(new User(3, "Sam", 20));
        users.add(new User(4, "Tom", 19));
        model.addAttribute("users", users);
        return "hello2";
    }

    @RequestMapping("scope")
    public String leafScope(HttpServletRequest request, Model model) {
        request.setAttribute("request", "request data");
        request.getSession().setAttribute("session", "session data");
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "hello2";
    }

    @RequestMapping("hello")
    public String demo(Model model, @RequestParam(name = "id", required = false) Integer id, @RequestParam(name = "name", required = false) String name) {
        model.addAttribute("message", "hello, john");
        model.addAttribute("year", LocalDateTime.now().getYear());

        model.addAttribute("id", id);
        model.addAttribute("name", name);

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

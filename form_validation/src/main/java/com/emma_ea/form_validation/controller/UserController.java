package com.emma_ea.form_validation.controller;

import com.emma_ea.form_validation.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("add")
    public String toAdd(User user) {
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        System.out.println("Save user =" + user);
        return "success";
    }

}

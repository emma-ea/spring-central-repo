package com.emma_ea.form_validation.controller;

import com.emma_ea.form_validation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
@Validated
public class UserController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("success");
    }

    @GetMapping("add")
    public String toAdd(User user) {
        return "add";
    }

    @PostMapping("add")
    public String add(@Valid User user, BindingResult result) {
        /// validation doesn't seem to work, I had to manually validate model fields
        if (result.hasErrors() || !validateUser(user)) {
            return "add";
        }
        System.out.println("Save user = " + user);
        return "redirect:/success";
    }

    public boolean validateUser(User user) {
        if (user.getName().isBlank() || user.getPassword().isBlank()) return false;
        return true;
    }

}

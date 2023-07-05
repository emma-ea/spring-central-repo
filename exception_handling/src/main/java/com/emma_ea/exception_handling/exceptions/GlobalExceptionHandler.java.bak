package com.emma_ea.exception_handling.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ArithmeticException.class)
    public ModelAndView catchMathError(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("mathError");
        return modelAndView;
    }

    @ExceptionHandler(value = NullPointerException.class)
    public String nullPointerError(Exception e, Model model) {
        model.addAttribute("exception", e.toString());
        return "nullPointerError";
    }

}

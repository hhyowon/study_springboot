package com.yojulab.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping({"/", "/home", "/main"})
    public ModelAndView main(ModelAndView modelAndView){
        return modelAndView;
    }
}
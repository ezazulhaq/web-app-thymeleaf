package com.haa.webappthymeleaf.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String welcome(Model theModel) {

        theModel.addAttribute("theDate", LocalDateTime.now());

        return "home";
    }
}

package com.thymeleaf.getchstore. controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World !!!");
        model.addAttribute("message2", "Hai World !!!");
        return "helloworld";
    }
}

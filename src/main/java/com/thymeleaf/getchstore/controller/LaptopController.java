package com.thymeleaf.getchstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.getchstore.models.Laptop;


@Controller
public class LaptopController {
    @GetMapping("data-laptop")
    public String dataLaptop(Model model) {
        Laptop laptop = new Laptop("1", "Asus", "ROG Zephyrus G14", 20000000);
        Laptop laptop2 = new Laptop("2", "Asus", "Nitro 5", 15000000);
        model.addAttribute("dataLaptop2", laptop2);
        model.addAttribute("dataLaptop", laptop);

        return "laptop";
    }

    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }
    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }


}
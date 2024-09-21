package com.thymeleaf.getchstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

import com.thymeleaf.getchstore.models.User;

@Controller
public class UserController {
    @GetMapping("users")
    public String listUsers(Model model){
        List<User> users =new ArrayList<>();
        users.add(new User(1, "WAHYU", 20, "ADMIN"));
        users.add(new User(2, "JEBREZ", 21, "USER"));
        users.add(new User(3, "WABREDZ", 22, "ADMIN"));
        users.add(new User(4, "DIMOENZ", 23, "USER"));
        model.addAttribute("listUsers",users);
        return "user";

    }
}

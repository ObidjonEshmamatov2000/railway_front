package com.mafia.railway_front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @GetMapping("/accessDenied")
    public String showAccessDenied() {
        return "accessDenied";
    }
}

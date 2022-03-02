package com.mafia.railway_front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String goHome() {
        return "home";
    }
}

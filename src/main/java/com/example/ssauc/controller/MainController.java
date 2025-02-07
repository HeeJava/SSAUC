package com.example.ssauc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() { return "index"; }

    @GetMapping("signIn")
    public String login() {return "user/signIn"; }
}

package com.example.ssauc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() { return "index"; }

    @GetMapping("signIn")
    public String login() {return "user/signIn"; }

    @GetMapping("signUp")
    public String signUp() {return "user/signUp"; }

    @GetMapping("mypage")
    public String mypage() {return "user/mypage"; }

    @GetMapping("product")
    public String product() {return "product/productList"; }

    @GetMapping("community")
    public String community() {return "community/community"; }

    @GetMapping("cart")
    public String basket() {return "product/cart"; }

    @GetMapping("like")
    public String like() {return "product/like"; }
}

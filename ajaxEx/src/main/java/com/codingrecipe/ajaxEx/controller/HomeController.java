package com.codingrecipe.ajaxEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String indedx() {
        return "index";
    }
}

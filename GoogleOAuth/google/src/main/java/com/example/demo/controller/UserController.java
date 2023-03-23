package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @GetMapping("/")
    public String welcome()
    {
        return "<h1>Welcome</h1>";
    }
    @GetMapping("/dashboard")
    public String userDetails()
    {
        return "<h1>Welcome to Dashboard</h1>";
    }
}
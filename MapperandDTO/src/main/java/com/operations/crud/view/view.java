package com.operations.crud.controller;

import com.operations.crud.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class view {
    private UserService userService;

    view(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/view/users")
    public String index(Model model) {
        model.addAttribute("allemplist", userService.getAllUsers());

        return "index";
    }
}

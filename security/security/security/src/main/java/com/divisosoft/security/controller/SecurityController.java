package com.divisosoft.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String index() {
        return "index"; // Home page for public access, ensure index.html exists
    }

    @GetMapping("home")
    public String home(Model model) {
        // You can add attributes to the model if needed
        model.addAttribute("message", "Welcome to the Admin Home Page!");
        return "home"; // Returns the home.html view
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        // Add attributes to model if needed
        return "loginView"; // return a view name that is not "/login"
    }

    @GetMapping("/logout-success")
    public String logoutSuccessPage() {
        return "logout-success"; // Logout success view, ensure logout-success.html exists
    }
}

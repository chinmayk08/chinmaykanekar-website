package com.example.Ck;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/login";  // or return "index" if you have index.html
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // show login.html
    }

    @PostMapping("/login")
    public String processLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {

        if ("chinmay".equals(username) && "sa".equals(password)) {
            model.addAttribute("username", username);
            return "home";
        } else {
            model.addAttribute("error", "Invalid Name or Password");
            return "login";
        }
    }
}

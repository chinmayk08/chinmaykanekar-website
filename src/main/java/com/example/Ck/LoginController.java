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
    public String showLoginForm(@RequestParam(value = "error", required = false) String error,
                                @RequestParam(value = "logout", required = false) String logout,
                                Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password.");
        }
        if (logout != null) {
            model.addAttribute("logout", "You have been logged out successfully.");
        }
        return "login";
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

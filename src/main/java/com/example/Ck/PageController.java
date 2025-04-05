package com.example.Ck;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

        @GetMapping("/home")
        public String home() {
            return "home";
        }

        @GetMapping("/about")
        public String about() {
            return "about";
        }

        @GetMapping("/skills")
        public String skills() {
            return "skills";
        }

        @GetMapping("/projects")
        public String projects() {
            return "projects";
        }

        @GetMapping("/contact")
        public String contact() {
            return "contact";
        }
    }

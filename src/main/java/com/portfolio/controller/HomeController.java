package com.portfolio.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/") public String home() { return "index"; }
    @GetMapping("/about") public String about() { return "about"; }
    @GetMapping("/skills") public String skills() { return "skills"; }
    @GetMapping("/experience") public String experience() { return "experience"; }
    @GetMapping("/education") public String education() { return "education"; }
    @GetMapping("/contact") public String contact() { return "contact"; }
}
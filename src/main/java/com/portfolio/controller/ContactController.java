package com.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @PostMapping("/sendMessage")
    public String sendMessage(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam(value = "subject", required = false) String subject,
            @RequestParam("message") String message,
            Model model) {

        // Log or print the details (for now, just simulate sending)
        System.out.println("Message received from: " + name + " (" + email + ")");
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        // Add success message to model
        model.addAttribute("successMessage", "Your message has been sent successfully! I’ll get back to you soon.");

        // Return the same contact page with success alert
        return "contact";
    }
}

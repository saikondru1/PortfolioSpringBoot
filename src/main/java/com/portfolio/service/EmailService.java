package com.portfolio.service;
import com.portfolio.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail(ContactForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("saicoc65@gmail.com");
        message.setSubject("Portfolio Contact: " + form.getName());
        message.setText("Name: " + form.getName() + "\nEmail: " + form.getEmail() + "\nMessage: " + form.getMessage());
        mailSender.send(message);
    }
}
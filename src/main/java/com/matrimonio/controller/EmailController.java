package com.matrimonio.controller;

import com.matrimonio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

@GetMapping("/send-email")
public String sendEmail() {
    try {
        emailService.sendEmail("matrimonioleonardoeleonora@gmail.com", "IL MATRIMONIO DI LEONARDO E ELEONORA", "Hai appena ricevuto l'invito ufficiale al nostro matrimonio!");
        return "success"; 

    } catch (Exception e) {
        return "Errore nell'invio dell'email: " + e.getMessage();
    }
}

}

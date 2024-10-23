package com.divisosoft.springEmailSender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divisosoft.springEmailSender.DTO.EmailRequest;
import com.divisosoft.springEmailSender.Service.EmailService;


@RestController
@RequestMapping("api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping()
    public ResponseEntity<String> sendMail(@RequestBody EmailRequest emailRequest) {

       try {
           emailService.sendEmail(emailRequest);

           return ResponseEntity.ok("Email sent successfully");

       } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to sent message : "+e.getMessage());
       }
    }
    
    }
    
    


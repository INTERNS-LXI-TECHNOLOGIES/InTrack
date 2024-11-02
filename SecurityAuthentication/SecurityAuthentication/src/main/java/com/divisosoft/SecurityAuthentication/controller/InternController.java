package com.divisosoft.SecurityAuthentication.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divisosoft.SecurityAuthentication.model.Intern;
import com.divisosoft.SecurityAuthentication.service.EmailService;
import com.divisosoft.SecurityAuthentication.service.InternService;



@RestController
@RequestMapping("/api/intern")
public class InternController {

    @Autowired
    private InternService internService;

    @Autowired
    private EmailService emailService;

    @PostMapping()
    public Intern registerIntern(@RequestBody Intern intern) {
        
        return internService.saveIntern(intern);
    }

   @PostMapping("/login")
public ResponseEntity<String> login(@RequestBody Map<String, String> loginData) {
    String email = loginData.get("email");
    String password = loginData.get("password");

    // Find intern by email
    Intern intern = internService.findByEmail(email);

    // Check if the intern exists and the password matches
    if (intern != null && intern.getPassword().equals(password)) {
        // Generate OTP
        String otp = internService.generateOTP();
        
        // Send OTP via email
        emailService.sendOTP(intern.getEmail(), otp);
        
        return ResponseEntity.ok("OTP has been sent to your email.");
    } else {
        
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials!");
    }
}


        

    }
    
    
    





    


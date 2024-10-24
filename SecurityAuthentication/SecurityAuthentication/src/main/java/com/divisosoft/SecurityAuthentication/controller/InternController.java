package com.divisosoft.SecurityAuthentication.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        
        if(internService.login(email, password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }

        

    }
    
    
    





    


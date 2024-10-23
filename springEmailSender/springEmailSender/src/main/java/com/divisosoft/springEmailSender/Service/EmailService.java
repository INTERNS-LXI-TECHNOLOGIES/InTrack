package com.divisosoft.springEmailSender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.divisosoft.springEmailSender.DTO.EmailRequest;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(EmailRequest emailRequest){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(emailRequest.getTo());
        message.setText(emailRequest.getMessage());
        message.setSubject(emailRequest.getSubject());

        mailSender.send(message);
    
}
}

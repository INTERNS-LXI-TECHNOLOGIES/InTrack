package com.divisosoft.SecurityAuthentication.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.SecurityAuthentication.model.Intern;
import com.divisosoft.SecurityAuthentication.repository.InternRepository;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    public Intern saveIntern(Intern intern){
        return internRepository.save(intern);
    }

    public String generateOTP(){

        Random random = new Random();

        return String.format("%06d" , random.nextInt(100000));
    }

    public Intern findByEmail(String email){

        return internRepository.findByEmail(email);
    }
    

    public Intern updateRole(Long id, String role){

        Intern intern = internRepository.findById(id).orElseThrow(()-> new RuntimeException("Intern not Found"));
        intern.setRole(role);

        return internRepository.save(intern);

    }
    public boolean login(String email, String password) {
        Intern intern = internRepository.findByEmail(email);
        if (intern != null && intern.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    
    
}

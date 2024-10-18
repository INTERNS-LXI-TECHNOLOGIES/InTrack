package com.divisosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.model.Intern;
import com.divisosoft.repository.InternRepository;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;


    public void updateIntern(Long id,Intern intern){
        Intern intern2 = internRepository.findById(id).orElse(intern);

        intern2.setName(intern.getName());
        intern2.setAge(intern.getAge());

        internRepository.save(intern2);
    }
}

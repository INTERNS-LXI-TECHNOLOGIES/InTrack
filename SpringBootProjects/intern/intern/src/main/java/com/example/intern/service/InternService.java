package com.example.intern.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.intern.model.Intern;
import com.example.intern.repository.InternRepository;


@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    public List<Intern> getAllIntern(){
        return internRepository.findAll();
    }

    public Intern createIntern(Intern intern){
        return internRepository.save(intern);
    }

    public Intern updateIntern(Long id, Intern intern){
       
        Optional<Intern> user = internRepository.findById(id);

        if(user.isPresent()){
            Intern upIntern = user.get();
            upIntern.setName(intern.getName());
            upIntern.setAge(intern.getAge());

            return internRepository.save(upIntern);
        }

        return  null;

    }

    


    


    
}

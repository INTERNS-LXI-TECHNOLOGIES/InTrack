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

    public void createIntern(Intern intern){
        internRepository.save(intern);
    }

    public void updateIntern(Long id, Intern intern){
       
        Intern user = internRepository.findById(id).orElse(null);

        if(user!=null){
            user.setName(intern.getName());
            user.setAge(intern.getAge());

             internRepository.save(user);
        }
    }

    public void upIntern(String name, Intern intern){
        Intern user = internRepository.findByName(name);

        if(user != null){
            user.setName(intern.getName());
            user.setAge(intern.getAge());

            internRepository.save(user);
        }
    }

    public void deleteIntern(Long id){

        Optional<Intern> user = internRepository.findById(id);

        if(user.isPresent()){
            Intern delIntern = user.get();

            internRepository.delete(delIntern);
        }
    }

    


    


    
}

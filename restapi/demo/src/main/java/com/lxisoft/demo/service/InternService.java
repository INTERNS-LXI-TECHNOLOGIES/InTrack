package com.lxisoft.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lxisoft.demo.entity.Intern;
import com.lxisoft.demo.repo.InternRepo;

@Service
public class InternService{

    @Autowired
    private InternRepo internRepo;

    public Intern createIntern(@RequestBody Intern intern){

        return internRepo.save(intern);
    }

    public List<Intern> searchIntern(){

        return internRepo.findAll();
    }

    public void deleteIntern(Long id){

        internRepo.deleteById(id);
    }

    public Intern updateIntern(Long id , Intern intern){
        
        Intern updateUser = internRepo.findById(id).orElse(null);

        if(updateUser==null){
            throw new RuntimeException("error:" + id);
        }
        
        updateUser.setName(intern.getName());
        updateUser.setAge(intern.getAge());

        return internRepo.save(updateUser);

    }


    
}
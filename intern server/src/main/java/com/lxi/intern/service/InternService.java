package com.lxi.intern.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lxi.intern.models.Intern;
import com.lxi.intern.repositories.InternRepository;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    
    public void createIntern(Intern intern) {
        internRepository.save(intern);
    }
    

    public List<Intern> getInterns() {
        List<Intern> internList =new ArrayList<>();
        try{
            internList=internRepository.findAll();
        }
        catch(Exception e){
            e.getMessage();
        }
        return internList;
       
    }

    public void update(Long id,Intern updateIntern){
     Optional<Intern> existingInternOptional = internRepository.findById(id);
      if(existingInternOptional.isPresent()){
        Intern intern= existingInternOptional.get();
        intern=updateIntern;
        internRepository.save(intern);
 
      }

    }
    
    public void delete(Long id){
        Optional<Intern> deleteInternOptional= internRepository.findById(id);
        if(deleteInternOptional.isPresent()){
            Intern intern = deleteInternOptional.get();
            internRepository.delete(intern);
        }
    }

    public Optional<Intern>getIternsById(Long id){
        return internRepository.findById(id);
    }

        

    }


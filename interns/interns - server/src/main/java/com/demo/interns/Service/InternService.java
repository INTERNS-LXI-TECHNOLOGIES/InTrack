package com.demo.interns.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.interns.Entity.InternEntity;
import com.demo.interns.Repository.InternsRepo;

@Service
public class InternService {

    @Autowired
    private InternsRepo internsRepo;
    

    public InternEntity addInterns(InternEntity interns){
       return internsRepo.save(interns);
    }

    public List<InternEntity> getAll(){
     return internsRepo.findAll();
    }

    public InternEntity updateIntern(Long id,InternEntity updateinterns){
        Optional <InternEntity> internoptional =  internsRepo.findById(id);

        if(internoptional!=null){
         InternEntity olderIntern=internoptional.get();
         olderIntern.setName(updateinterns.getName());
         olderIntern.setName(updateinterns.getEmailid());
         return internsRepo.save(olderIntern);
          }
        else{
            return null;
        }  
    }
    
    public void deleteIntern(Long id){
        Optional <InternEntity> internopt =  internsRepo.findById(id);  
      if(internopt!=null){
        InternEntity existintern = internopt.get();
        internsRepo.delete(existintern);
      }
    }

    

   
}

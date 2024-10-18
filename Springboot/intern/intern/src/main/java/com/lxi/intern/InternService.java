package com.lxi.intern;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternService
{
    @Autowired
    private InternRepository iRepo;
    
    public void  create(Intern intern)
    {
      iRepo.save(intern);  
    }


    public List<Intern> read()
    {
       return iRepo.findAll();
    }
   
    public Intern update(Long id,Intern updatedIntern)
    {
        Optional <Intern> currentIntern = iRepo.findById(id);

        if(currentIntern.isPresent())
        {
            Intern existingIntern = currentIntern.get();

           existingIntern.setName(updatedIntern.getName());

           existingIntern.setAge(updatedIntern.getAge());

           existingIntern.setEmail(updatedIntern.getEmail());
           
           iRepo.save(existingIntern);
           return existingIntern;
        }
        else
        {
            System.out.println("!cannot find id !");
            return null;
        }
    }



    public String delete(Long id)
    {
        Optional<Intern>intern = iRepo.findById(id);
        if(intern.isPresent())
        {
        Intern deleteIntern = intern.get();
        iRepo.delete(deleteIntern);
        return deleteIntern.getName()+ "   Succesfully Deleted";
        }
        else
        {
            System.out.println("Cannot find id!");
            return null;
        }
    } 


}
package com.divisosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.models.Intern;
import com.divisosoft.repository.InternRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InternService {
    @Autowired
    private InternRepository internRepository;

  public List<Intern> getAllResources() {
       
    List<Intern>result =null;
       try{
        result = internRepository.findAll();

        } catch (Exception e) {
            System.err.println("Exception when calling findMyResources:");
            e.printStackTrace();
        }
        return result;
    }
   

   

    public Optional<Intern> getInternById(Long id) {
        return internRepository.findById(id);
    }

    public Intern createIntern(Intern intern) {
        return internRepository.save(intern);
    }

    public Optional<Intern> updateIntern(Long id, Intern updatedIntern) {
        return internRepository.findById(id)
                .map(intern -> {
                    intern.setName(updatedIntern.getName());
                    intern.setAge(updatedIntern.getAge());
                    return internRepository.save(intern);
                });
    }

    public boolean deleteIntern(Long id) {
        if (internRepository.existsById(id)) {
            internRepository.deleteById(id);
            return true;
        }
        return false;
    }


}

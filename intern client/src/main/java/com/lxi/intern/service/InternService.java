package com.lxi.intern.service;

import java.util.List;
import java.util.Optional;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lxi.intern.models.Intern;
import com.lxi.intern.repositories.InternRepository;

@Service
public class InternService {

    

    @Autowired
    private InternRepository internRepository;

    public List<org.openapitools.client.model.Intern> getInterns() throws ApiException {
        ApiClient apiClient=new ApiClient();
        apiClient.setBasePath("http://localhost:8080");
        
       
        
        InternControllerApi internControllerApi = new InternControllerApi(apiClient);
        List<org.openapitools.client.model.Intern> readList= internControllerApi.getAllInterns();
        
       
         return readList;
     }
    
    public void createIntern(Intern intern) {
        internRepository.save(intern);
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


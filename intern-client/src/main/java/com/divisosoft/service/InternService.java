package com.divisosoft.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.models.Intern;
import com.divisosoft.repository.InternRepository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;
     public List<org.openapitools.client.model.Intern> getAllResources() {
       
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8083"); // Set your API base URL

    
        InternControllerApi myResourceApi = new InternControllerApi(apiClient);
         List<org.openapitools.client.model.Intern> internapi=new ArrayList<>();
        try {
             internapi= myResourceApi.getAllInterns();
            }
        catch(ApiException e){
            System.out.println("Api Exeception"+e.getMessage());
             } catch (Exception e) {
            System.err.println("Exception when calling findMyResources:"+e.getMessage());
            
        }
        return internapi;
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

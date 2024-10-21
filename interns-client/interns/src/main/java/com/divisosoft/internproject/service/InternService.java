package com.divisosoft.internproject.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.internproject.entity.Intern;
import com.divisosoft.internproject.repo.InternRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    public List<org.openapitools.client.model.Intern> getAllResources() {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");
        InternControllerApi myResourceApi = new InternControllerApi(apiClient);
        List<org.openapitools.client.model.Intern> internList=new ArrayList<>();
        try{
            internList=myResourceApi.getAllInterns();
        }
        catch(ApiException e){
            System.out.println("inters exception" +e.getMessage());
        }
        catch(Exception  e){
            System.out.println("intern exception"+e.getMessage());
        }

        return internList;

    }

    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    public Optional<Intern> getInternById(Long id) {
        return internRepository.findById(id);
    }

    // Update an intern
    public Intern updateIntern(Long id, Intern updatedIntern) {
        Optional<Intern> internOptional = internRepository.findById(id);
        if (internOptional.isPresent()) {
            Intern existingIntern = internOptional.get();
            existingIntern.setName(updatedIntern.getName());
            existingIntern.setAge(updatedIntern.getAge());
            return internRepository.save(existingIntern);
        }
        return null;
    }

    public void deleteIntern(Long id) {
        internRepository.deleteById(id);
    }
}

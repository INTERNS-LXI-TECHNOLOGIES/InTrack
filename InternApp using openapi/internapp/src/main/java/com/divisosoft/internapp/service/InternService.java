package com.divisosoft.internapp.service;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternsControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.divisosoft.internapp.model.Intern;
import com.divisosoft.internapp.repository.InternRepository;

@Service
public class InternService {

    

    @Autowired
    private InternRepository internRepo ;

    public List<org.openapitools.client.model.Intern> getInterns() {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("http://localhost:8081/myapp");

    InternsControllerApi internsControllerApi = new InternsControllerApi(apiClient);
    List<org.openapitools.client.model.Intern> result = new ArrayList<>();

    try {
        result = internsControllerApi.getInterns();
    } catch (ApiException e) {
        // Log the error message
        System.err.println("API Exception: " + e.getMessage());
        // You may want to rethrow the exception or handle it as needed
    } catch (Exception e) {
        // Handle any other exceptions that may occur
        System.err.println("Unexpected error: " + e.getMessage());
    }

    return result;
}


    public void addIntern(Intern intern){
        internRepo.save(intern);
    }

    public void updateIntern(long id ,Intern intern){
        Intern intern2 = internRepo.findById(id).orElse(null);
        if (intern2!=null) {
            intern2.setName(intern.getName());
            intern2.setAge(intern.getAge());
            intern2.setPhone(intern.getPhone());
            internRepo.save(intern2);
        }
    }

    public void deleteIntern(Long id){
        Intern intern = internRepo.findById(id).orElse(null);

        if(intern!=null){
            internRepo.deleteById(intern.getId());
        }
    }

}

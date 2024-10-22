package com.divisosoft.services;

import java.util.List;
import java.util.Optional;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.models.Intern;
import com.divisosoft.repositories.InternRepository;


@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;



    public List<org.openapitools.client.model.Intern>getAllInterns() throws ApiException{
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");
        InternControllerApi  internControllerApi = new InternControllerApi(apiClient);
        List<org.openapitools.client.model.Intern> serverInterns = internControllerApi.getInterns();
        return serverInterns;
    }

    public Optional<Intern>getIternsById(Long id){
        return internRepository.findById(id);
    }

    public void saveIntern(Intern intern){
        internRepository.save(intern);
    }

    public void updatingIntern(Long id,Intern intern){
        Optional<Intern> internOptional = internRepository.findById(id);
        if(internOptional!=null){
            Intern newIntern = internOptional.get();
            newIntern = intern;
            internRepository.save(newIntern);
        }
        else{
            System.out.println("no intern found");
        }
    }

    public void deletingIntern(Long id){
        Optional<Intern> internOptional = internRepository.findById(id);
        if(internOptional!=null){
            Intern deleteIntern = internOptional.get();
            internRepository.delete(deleteIntern);
        }
        else{
            System.out.println("no intern found");
        }
    }

}

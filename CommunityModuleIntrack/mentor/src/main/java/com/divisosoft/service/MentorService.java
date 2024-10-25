package com.divisosoft.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternControllerApi;
import org.openapitools.client.model.Intern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.model.Mentor;
import com.divisosoft.repository.MentorRepository;

import java.util.*;

@Service
public class MentorService {

    @Autowired
    MentorRepository mentorRepository;
    

public List<Intern> getIntern() throws ApiException{
    ApiClient apiclient=new ApiClient();
    apiclient.setBasePath("http://localhost:8081");

    InternControllerApi internControllerApi=new InternControllerApi(apiclient);
     return internControllerApi.getInterns();

    }

    public void savefeedback(Long internId,String feedback){
        Mentor mentor=new Mentor();
      mentor.setInternId(internId);
      mentor.setFeedback(feedback);
    mentorRepository.save(mentor);
    }

    
}

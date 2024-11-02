package com.lxisoft.intrack.careerguidance.service;
import java.util.List;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.QuestionControllerApi;
import org.openapitools.client.model.QuestionEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService{

    public List<QuestionEntity> questionShow() throws ApiException{
        
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        QuestionControllerApi questionControllerApi = new QuestionControllerApi(apiClient);

        List<QuestionEntity> questionShowing = questionControllerApi.readQuestions();

    return questionShowing;

    }
}
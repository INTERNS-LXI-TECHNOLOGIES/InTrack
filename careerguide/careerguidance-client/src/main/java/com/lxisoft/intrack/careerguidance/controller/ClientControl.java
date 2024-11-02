package com.lxisoft.intrack.careerguidance.controller;

import java.util.List;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.QuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.intrack.careerguidance.service.ClientService;

@RestController
@RequestMapping("/")
public class ClientControl{
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/show")
    public List<QuestionEntity> bringDatas() throws ApiException{
        return clientService.questionShow();
    }
}
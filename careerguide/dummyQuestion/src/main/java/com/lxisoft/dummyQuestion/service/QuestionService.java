package com.lxisoft.dummyQuestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.dummyQuestion.entity.QuestionEntity;
import com.lxisoft.dummyQuestion.repository.QuestionRepo;

@Service
public class QuestionService{

@Autowired
private QuestionRepo questionRepo;

    public List<QuestionEntity> getQuestions(){

        return questionRepo.findAll();

        
    }





    
}
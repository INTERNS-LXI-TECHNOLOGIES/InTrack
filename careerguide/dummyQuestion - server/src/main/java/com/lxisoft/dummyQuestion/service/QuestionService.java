package com.lxisoft.dummyQuestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lxisoft.dummyQuestion.entity.QuestionEntity;
import com.lxisoft.dummyQuestion.repository.QuestionRepo;

@Service
public class QuestionService{

@Autowired
private QuestionRepo questionRepo;

    public QuestionEntity createQuestions(@RequestBody QuestionEntity questionEntity){
    
        return questionRepo.save(questionEntity);
    }

    public List<QuestionEntity> getQuestions(){

        return questionRepo.findAll();
    }
}
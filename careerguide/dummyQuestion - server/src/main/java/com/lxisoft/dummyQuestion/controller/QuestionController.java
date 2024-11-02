package com.lxisoft.dummyQuestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.dummyQuestion.entity.QuestionEntity;
import com.lxisoft.dummyQuestion.service.QuestionService;

@RestController
public class QuestionController{

@Autowired
private QuestionService questionService;

    @GetMapping("/read")
    public List<QuestionEntity> readQuestions(){

        return questionService.getQuestions();
    }
}
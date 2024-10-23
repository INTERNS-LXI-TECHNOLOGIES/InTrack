package com.lxisoft.spamdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.spamdetails.entity.BalancedScoreCardEntity;
import com.lxisoft.spamdetails.service.BalancedScoreCardService;

@RestController
//@RequestMapping("/api")
public class BalancedScoreCardController{

    @Autowired
    private BalancedScoreCardService bscService;

    @GetMapping("/get")
    public List<BalancedScoreCardEntity> showDetails(){
        return bscService.getAllDetails();
    }
    
}
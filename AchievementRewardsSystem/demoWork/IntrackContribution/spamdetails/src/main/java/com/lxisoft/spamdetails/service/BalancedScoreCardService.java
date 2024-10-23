package com.lxisoft.spamdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.spamdetails.entity.BalancedScoreCardEntity;
import com.lxisoft.spamdetails.repository.BalancedScoreCardRepository;

@Service
public class BalancedScoreCardService{

    @Autowired
    private BalancedScoreCardRepository bscRepository;

    public List<BalancedScoreCardEntity> getAllDetails(){
        return bscRepository.findAll();
    }
    
}
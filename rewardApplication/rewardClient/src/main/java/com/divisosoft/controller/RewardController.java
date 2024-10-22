package com.divisosoft.controller;

import java.util.List;

import org.openapitools.client.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divisosoft.service.RewardService;
import com.divisosoft.model.Reward;

@RestController
@RequestMapping("/")
public class RewardController {

@Autowired
RewardService service;

@PostMapping("/create")
public void createRewards(@RequestBody Reward reward){
     service.createReward(reward);
}

@GetMapping
public List<org.openapitools.client.model.Reward> getRewards() throws ApiException{
    return service.getReward();   
}

@GetMapping("/{name}")
public Reward getRewardbyNames(@PathVariable String name){
    return service.getRewardbyName(name);
}


@PutMapping("/{id}")
public void updateRewards(@PathVariable Long id,@RequestBody Reward reward){
    service.updateReward(id,reward);
}

@DeleteMapping("/{id}")
public void deleteRewards(@PathVariable Long id){
    service.deleteReward(id);

}


    
}

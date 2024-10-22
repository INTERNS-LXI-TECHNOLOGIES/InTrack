package com.divisosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.repository.RewardRepository;
import com.divisosoft.model.Reward;

@Service
public class RewardService {

@Autowired
RewardRepository repo;

    public void createReward(Reward reward){
        repo.save(reward);

    }

    public List<Reward> getReward(){
        return repo.findAll();
    }

    public void updateReward(Long id,Reward reward){
      Reward  reward2=repo.findById(id).orElse(null);

      reward2.setName(reward.getName());
      reward2.setPoints(reward.getPoints());
      repo.save(reward2);
    }

    public void deleteReward(Long id){
        repo.deleteById(id);
    }

    public Reward getRewardbyName(String name){
       Reward reward3=repo.findByName(name);
       return reward3;
    }

}

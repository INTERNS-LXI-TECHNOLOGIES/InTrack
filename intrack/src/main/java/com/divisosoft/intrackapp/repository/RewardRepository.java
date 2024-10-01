package com.divisosoft.intrackapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.divisosoft.intrackapp.model.Reward;

//@Repository
public interface RewardRepository extends JpaRepository<Reward , Long>{

    Reward findByName(String string);
    
}

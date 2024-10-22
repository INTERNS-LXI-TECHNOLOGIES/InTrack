package com.divisosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.model.Reward;

@Repository
public interface RewardRepository  extends JpaRepository<Reward, Long>{


    public Reward findByName(String name);
}

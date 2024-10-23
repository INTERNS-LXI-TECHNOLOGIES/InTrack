package com.lxisoft.spamdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.spamdetails.entity.BalancedScoreCardEntity;

@Repository
public interface BalancedScoreCardRepository extends JpaRepository<BalancedScoreCardEntity, Long>{
    
}
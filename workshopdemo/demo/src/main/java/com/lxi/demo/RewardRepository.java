package com.lxi.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface RewardRepository extends JpaRepository<Reward ,Long> {
    List<Reward> findAll() ;
    

    
}

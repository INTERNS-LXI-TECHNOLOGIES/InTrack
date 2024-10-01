package com.divisosoft.intrackapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divisosoft.intrackapp.model.Player;

public interface PlayerRepository extends JpaRepository<Player , Long>{
    
}

package com.divisosoft.mindfullness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.mindfullness.model.Activities;

@Repository
public interface ActivitesRepository extends JpaRepository<Activities , Long>{
    
}

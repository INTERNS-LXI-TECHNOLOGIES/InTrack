package com.divisosoft.internapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.internapp.model.Intern;

@Repository
public interface InternRepository extends JpaRepository<Intern,Long>{
    
}

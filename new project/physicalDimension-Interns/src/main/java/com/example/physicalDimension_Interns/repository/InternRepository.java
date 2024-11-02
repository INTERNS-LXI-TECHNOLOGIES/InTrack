package com.example.physicalDimension_Interns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.physicalDimension_Interns.model.Intern;

@Repository
public interface  InternRepository extends JpaRepository <Intern, Long>{
  
}

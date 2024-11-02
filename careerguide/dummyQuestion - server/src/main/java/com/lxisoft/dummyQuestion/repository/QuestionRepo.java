package com.lxisoft.dummyQuestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.dummyQuestion.entity.QuestionEntity;

@Repository
public interface QuestionRepo extends JpaRepository<QuestionEntity, Long>{





    
}
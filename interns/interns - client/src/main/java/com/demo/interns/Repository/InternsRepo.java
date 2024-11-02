package com.demo.interns.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.interns.Entity.InternEntity;

@Repository
public interface InternsRepo  extends  JpaRepository<InternEntity,Long> {

    
}

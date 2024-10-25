package com.divisosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.model.Mentor;
@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long>{
    
}

package com.example.physicalDimension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.physicalDimension.model.InternExercise;

@Repository
public interface InternExerciseRepository extends JpaRepository<InternExercise, Long> {
    
}

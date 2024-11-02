package com.lxi.interndemmy.repository;


import com.lxi.interndemmy.model.TaskCompletion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskCompletionRepository extends JpaRepository<TaskCompletion, Long> {

    List<TaskCompletion> findByInternId(Long internId);
}

package com.lxi.interndemmy.repository;
import com.lxi.interndemmy.model.Feedback;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    List<Feedback> findByInternId(Long internId);
}

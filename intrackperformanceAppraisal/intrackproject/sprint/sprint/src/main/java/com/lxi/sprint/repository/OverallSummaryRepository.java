package com.lxi.sprint.repository;

import com.lxi.sprint.model.OverallSummaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverallSummaryRepository extends JpaRepository<OverallSummaryEntity, Long> {
}

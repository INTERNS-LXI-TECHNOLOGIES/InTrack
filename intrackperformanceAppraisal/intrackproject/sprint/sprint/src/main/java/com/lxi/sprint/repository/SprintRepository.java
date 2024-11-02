package com.lxi.sprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lxi.sprint.model.Sprint;
import java.util.Optional; // Import Optional

public interface SprintRepository extends JpaRepository<Sprint, Long> {
    // Add this line to find a Sprint by its sprint number
    Optional<Sprint> findBySprintNumber(int sprintNumber);
}

package com.divisosofttec.mentaldimension;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MentalRepository extends JpaRepository<MentalDimensional, Long> {
    List<MentalDimensional> findAll();
}

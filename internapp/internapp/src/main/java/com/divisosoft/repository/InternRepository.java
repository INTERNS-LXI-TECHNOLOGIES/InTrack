package com.divisosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.model.Intern;

@Repository
public interface InternRepository extends JpaRepository<Intern, Long> {
    // You can add custom query methods here if needed
}

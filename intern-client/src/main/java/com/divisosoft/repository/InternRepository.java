package com.divisosoft.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.models.Intern;

@Repository
public interface InternRepository extends JpaRepository<Intern, Long> {
}


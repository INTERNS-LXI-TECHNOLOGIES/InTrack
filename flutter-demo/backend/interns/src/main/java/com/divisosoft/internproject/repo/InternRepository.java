package com.divisosoft.internproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divisosoft.internproject.entity.Intern;

public interface InternRepository extends JpaRepository<Intern, Long> {
}

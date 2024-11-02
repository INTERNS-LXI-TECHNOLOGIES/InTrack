package com.lxi.interndemmy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lxi.interndemmy.dto.InternHistoryDTO;
import com.lxi.interndemmy.model.Intern;



@Repository
public interface InternRepository extends JpaRepository<Intern, Long> {
    // This method is already provided by JpaRepository
    InternHistoryDTO findInternHistoryById(@Param("internId") Long internId);
}

        
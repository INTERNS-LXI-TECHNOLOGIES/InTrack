package com.lxi.interndemmy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxi.interndemmy.model.Attendance;


public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    List<Attendance> findByInternId(Long internId);
    
}


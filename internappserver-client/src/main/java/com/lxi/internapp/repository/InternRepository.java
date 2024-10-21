package com.lxi.internapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxi.internapp.entity.InternEnity;

public interface InternRepository extends JpaRepository<InternEnity, Long >{
   
}

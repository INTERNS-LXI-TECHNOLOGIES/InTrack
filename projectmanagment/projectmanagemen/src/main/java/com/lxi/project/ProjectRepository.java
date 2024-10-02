package com.lxi.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
    List<Project> findAll();
}
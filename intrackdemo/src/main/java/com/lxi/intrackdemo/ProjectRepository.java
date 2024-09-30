package com.lxi.intrackdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface ProjectRepository extends JpaRepository<Project, Long>{
    List<Project> findAll();
}

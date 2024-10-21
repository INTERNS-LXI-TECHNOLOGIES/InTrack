package com.lxisoft.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.demo.entity.Intern;

@Repository
public interface InternRepo extends JpaRepository<Intern, Long>{





    
}
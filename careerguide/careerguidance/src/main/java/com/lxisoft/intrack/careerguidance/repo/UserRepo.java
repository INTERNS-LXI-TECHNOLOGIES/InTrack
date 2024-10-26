package com.lxisoft.intrack.careerguidance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.intrack.careerguidance.entity.UserEntity;



@Repository
public interface UserRepo extends JpaRepository<UserEntity , Long> {



    
}
package com.lxisoft.firstdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.firstdemo.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
}
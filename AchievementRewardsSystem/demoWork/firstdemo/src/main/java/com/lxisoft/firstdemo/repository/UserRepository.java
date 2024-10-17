package com.lxisoft.firstdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.firstdemo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
}
package com.divisosoft.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divisosoft.security.model.User;

public interface UserRepository extends JpaRepository<User , Long>{
    User findByUserName(String userName);
}

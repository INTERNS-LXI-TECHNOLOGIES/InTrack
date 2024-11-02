package com.divisosoft.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divisosoft.security.model.Role;

public interface RoleRepository extends JpaRepository<Role , Long>{
    Role findByRoleName(String roleName);
}

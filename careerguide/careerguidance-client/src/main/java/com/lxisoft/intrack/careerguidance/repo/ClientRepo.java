package com.lxisoft.intrack.careerguidance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.intrack.careerguidance.entity.ClientEntity;



@Repository
public interface ClientRepo extends JpaRepository<ClientEntity , Long> {



    
}
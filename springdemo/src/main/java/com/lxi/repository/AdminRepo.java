package com.lxi.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxi.entity.Admin;



@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {

    List<Admin> findAll() ;

}
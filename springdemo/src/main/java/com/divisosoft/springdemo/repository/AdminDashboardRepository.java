package com.divisosoft.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.springdemo.entity.AdminDashboard;

import java.util.List;


@SuppressWarnings("unused")
@Repository
public interface AdminDashboardRepository extends JpaRepository<AdminDashboard, Long> {

    List<AdminDashboard> findAll() ;

}

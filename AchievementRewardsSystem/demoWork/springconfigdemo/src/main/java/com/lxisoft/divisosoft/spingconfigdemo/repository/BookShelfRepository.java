package com.lxisoft.divisosoft.spingconfigdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.divisosoft.spingconfigdemo.entity.BookShelfEntity;

@Repository
public interface BookShelfRepository extends JpaRepository<BookShelfEntity, Long>{
    List<BookShelfEntity> findAll();
}
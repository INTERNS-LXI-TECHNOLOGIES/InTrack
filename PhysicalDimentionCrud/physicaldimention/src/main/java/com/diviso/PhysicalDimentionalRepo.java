package com.diviso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface PhysicalDimentionalRepo extends JpaRepository<PhysicalDimentional, Long> {

    List<PhysicalDimentional> findAll();

}

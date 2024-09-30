package com.divisosofttech.intrack.holisticlearningframework.repo;

import com.divisosofttech.intrack.holisticlearningframework.entity.MentalDimention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // get implicitly
public interface PhysicalDimentionRepository extends JpaRepository<MentalDimention, Long> {

}
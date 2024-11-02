package com.demo.interns.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.interns.Entity.SocialChallages;
@Repository
public interface ChallangeRepository  extends JpaRepository<SocialChallages,Long>{

}

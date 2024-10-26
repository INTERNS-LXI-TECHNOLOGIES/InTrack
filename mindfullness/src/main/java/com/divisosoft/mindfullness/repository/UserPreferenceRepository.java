package com.divisosoft.mindfullness.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divisosoft.mindfullness.model.UserPreference;

@Repository
public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long>{
    List<UserPreference> findAllByUserId(int i);
    List<UserPreference> findByFrequency(String frequency);
}

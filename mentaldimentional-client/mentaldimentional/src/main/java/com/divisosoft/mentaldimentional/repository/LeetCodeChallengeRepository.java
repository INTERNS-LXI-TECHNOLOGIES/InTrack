package com.divisosoft.mentaldimentional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divisosoft.mentaldimentional.entity.LeetCodeChallenge;

public interface LeetCodeChallengeRepository extends JpaRepository<LeetCodeChallenge, Long> {
}

package com.divisosoft.mentaldimentional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisosoft.mentaldimentional.entity.LeetCodeChallenge;
import com.divisosoft.mentaldimentional.service.LeetCodeChallengeService;

import java.util.List;

@RestController
@RequestMapping("/api/cognitive/challenges")
public class LeetCodeChallengeController {

    @Autowired
    private LeetCodeChallengeService challengeService;

    // Create a new challenge
    @PostMapping("/create")
    public ResponseEntity<LeetCodeChallenge> createChallenge(@RequestBody LeetCodeChallenge challenge) {
        return ResponseEntity.ok(challengeService.createChallenge(challenge));
    }

    // Get a challenge by ID
    @GetMapping("/{id}")
    public ResponseEntity<LeetCodeChallenge> getChallengeById(@PathVariable Long id) {
        return ResponseEntity.ok(challengeService.getChallengeById(id));
    }

    // Get all challenges
    @GetMapping("/all")
    public ResponseEntity<List<LeetCodeChallenge>> getAllChallenges() {
        return ResponseEntity.ok(challengeService.getAllChallenges());
    }

    // Update a challenge by ID
    @PutMapping("/{id}")
    public ResponseEntity<LeetCodeChallenge> updateChallenge(
            @PathVariable Long id,
            @RequestBody LeetCodeChallenge updatedChallenge) {
        return ResponseEntity.ok(challengeService.updateChallenge(id, updatedChallenge));
    }

    // Delete a challenge by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChallengeById(@PathVariable Long id) {
        challengeService.deleteChallengeById(id);
        return ResponseEntity.noContent().build();
    }

    // Delete all challenges
    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAllChallenges() {
        challengeService.deleteAllChallenges();
        return ResponseEntity.noContent().build();
    }

    // Submit solution
    @PostMapping("/submit")
    public ResponseEntity<String> submitSolution(@RequestParam Long challengeId, @RequestParam String solution) {
        String feedback = challengeService.submitSolution(challengeId, solution);
        return ResponseEntity.ok(feedback);
    }
}

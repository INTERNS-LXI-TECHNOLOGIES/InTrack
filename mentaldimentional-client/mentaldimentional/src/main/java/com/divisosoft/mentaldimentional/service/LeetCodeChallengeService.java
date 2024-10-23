package com.divisosoft.mentaldimentional.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;

import org.openapitools.client.api.LeetCodeChallengeControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.mentaldimentional.entity.LeetCodeChallenge;
import com.divisosoft.mentaldimentional.repository.LeetCodeChallengeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeetCodeChallengeService {

    @Autowired
    private LeetCodeChallengeRepository challengeRepository;

    public List<org.openapitools.client.model.LeetCodeChallenge> getAllResources() {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");
        LeetCodeChallengeControllerApi myResourceApi = new LeetCodeChallengeControllerApi(apiClient);
        List<org.openapitools.client.model.LeetCodeChallenge> leetCodeChallengeList = new ArrayList<>();
        try {
            leetCodeChallengeList = myResourceApi.getAllChallenges();
        } catch (ApiException e) {
            System.out.println("LeetCodeChallengeList exception" + e.getMessage());
        } catch (Exception e) {
            System.out.println("CognitiveWorkshop exception" + e.getMessage());
        }

        return leetCodeChallengeList;

    }

    // Create a new challenge
    public LeetCodeChallenge createChallenge(LeetCodeChallenge challenge) {
        return challengeRepository.save(challenge);
    }

    // Get a challenge by ID (Read)
    public LeetCodeChallenge getChallengeById(Long id) {
        return challengeRepository.findById(id).orElseThrow(() -> new RuntimeException("Challenge not found"));
    }

    // Get all challenges (Read All)
    public List<LeetCodeChallenge> getAllChallenges() {
        return challengeRepository.findAll();
    }

    // Update a challenge
    public LeetCodeChallenge updateChallenge(Long id, LeetCodeChallenge updatedChallenge) {
        LeetCodeChallenge existingChallenge = getChallengeById(id);
        existingChallenge.setTitle(updatedChallenge.getTitle());
        existingChallenge.setDescription(updatedChallenge.getDescription());
        existingChallenge.setExpectedSolution(updatedChallenge.getExpectedSolution());
        return challengeRepository.save(existingChallenge);
    }

    // Delete a challenge by ID
    public void deleteChallengeById(Long id) {
        challengeRepository.deleteById(id);
    }

    // Delete all challenges
    public void deleteAllChallenges() {
        challengeRepository.deleteAll();
    }

    // Submit solution for evaluation
    public String submitSolution(Long challengeId, String submittedSolution) {
        LeetCodeChallenge challenge = getChallengeById(challengeId);

        // Logic for evaluating the solution
        if (challenge.getExpectedSolution().equals(submittedSolution.trim())) {
            return "Solution is correct!";
        } else {
            return "Solution is incorrect. Try again.";
        }
    }
}

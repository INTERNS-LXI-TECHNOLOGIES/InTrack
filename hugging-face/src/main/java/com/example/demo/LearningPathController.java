package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/recommend")
public class LearningPathController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/generate")
    public ResponseEntity<String> generateLearningPath(@RequestBody Map<String, Object> internData) {
        String internName = internData.get("name").toString();
        String weaknesses = internData.get("weaknesses").toString();
        String experience = internData.get("experience").toString();
        String skills = internData.get("skills").toString();
        String completedTasks = internData.get("completed_tasks").toString();
       
        // Automatically generate the prompt based on the intern's data
        String prompt = String.format(
                "Generate a personalized learning path for %s. They have experience as a %s. " +
                "Their weaknesses include %s, and they are skilled in %s. They have completed %s tasks so far.",
                internName, experience, weaknesses, skills, completedTasks);

        // Call GPT-2 to generate recommendations (API call like you did previously)
        String apiUrl = "https://api-inference.huggingface.co/models/gpt2";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer  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");
        headers.set("Content-Type", "application/json");

        String requestBody = String.format("{\"inputs\": \"%s\"}", prompt);
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        try {
            ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, entity, String.class);
            return ResponseEntity.ok(response.getBody());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
}



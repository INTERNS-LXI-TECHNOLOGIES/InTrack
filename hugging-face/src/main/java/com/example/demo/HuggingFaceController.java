package com.example.demo;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/generate")
public class HuggingFaceController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public ResponseEntity<String> generate(@RequestBody Map<String, String> requestBody) {
        String prompt = requestBody.get("prompt");
        
        // Check if the prompt is provided
        if (prompt == null || prompt.isEmpty()) {
            return ResponseEntity.badRequest().body("Prompt is required");
        }

        String apiUrl = "https://api-inference.huggingface.co/models/openai-community/gpt2"; 
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer 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"); 
        headers.set("Content-Type", "application/json");

        String requestBodyJson = String.format("{\"inputs\": \"%s\"}", prompt);
        HttpEntity<String> entity = new HttpEntity<>(requestBodyJson, headers);

        try {
            ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, entity, String.class);
            return ResponseEntity.ok(response.getBody());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
}

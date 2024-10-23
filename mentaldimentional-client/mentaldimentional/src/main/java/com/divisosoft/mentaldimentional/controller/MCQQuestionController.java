package com.divisosoft.mentaldimentional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisosoft.mentaldimentional.entity.MCQQuestion;
import com.divisosoft.mentaldimentional.service.MCQQuestionService;

import java.util.List;

@RestController
@RequestMapping("/api/mcq")
public class MCQQuestionController {

    @Autowired
    private MCQQuestionService mcqService;

    // Create a new MCQ question
    @PostMapping
    public ResponseEntity<MCQQuestion> createQuestion(@RequestBody MCQQuestion mcqQuestion) {
        MCQQuestion createdQuestion = mcqService.createQuestion(mcqQuestion);
        return new ResponseEntity<>(createdQuestion, HttpStatus.CREATED);
    }

    // Get all MCQ questions
    @GetMapping
    public ResponseEntity<List<MCQQuestion>> getAllQuestions() {
        List<MCQQuestion> questions = mcqService.getAllQuestions();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    // Get a specific MCQ question by ID
    @GetMapping("/{id}")
    public ResponseEntity<MCQQuestion> getQuestionById(@PathVariable Long id) {
        MCQQuestion question = mcqService.getQuestionById(id);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    // Update an existing MCQ question
    @PutMapping("/{id}")
    public ResponseEntity<MCQQuestion> updateQuestion(@PathVariable Long id, @RequestBody MCQQuestion updatedQuestion) {
        MCQQuestion question = mcqService.updateQuestion(id, updatedQuestion);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    // Delete a specific MCQ question by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        mcqService.deleteQuestion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Delete all MCQ questions
    @DeleteMapping
    public ResponseEntity<Void> deleteAllQuestions() {
        mcqService.deleteAllQuestions();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Submit an answer for a question
    @PostMapping("/{id}/submit")
    public ResponseEntity<String> submitAnswer(@PathVariable Long id, @RequestBody String answer) {
        boolean isCorrect = mcqService.submitAnswer(id, answer);
        return isCorrect
                ? ResponseEntity.ok("Correct answer!")
                : ResponseEntity.ok("Incorrect answer, try again.");
    }
}

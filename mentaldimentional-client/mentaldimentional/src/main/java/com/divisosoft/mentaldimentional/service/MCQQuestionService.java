package com.divisosoft.mentaldimentional.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;

import org.openapitools.client.api.McqQuestionControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.mentaldimentional.entity.MCQQuestion;
import com.divisosoft.mentaldimentional.repository.MCQQuestionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MCQQuestionService {

    @Autowired
    private MCQQuestionRepository mcqRepository;

    public List<org.openapitools.client.model.MCQQuestion> getAllResources() {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");
        McqQuestionControllerApi myResourceApi = new McqQuestionControllerApi(apiClient);
        List<org.openapitools.client.model.MCQQuestion> mCQQuestionList = new ArrayList<>();
        try {
            mCQQuestionList = myResourceApi.getAllQuestions();
        } catch (ApiException e) {
            System.out.println("MCQQuestionList exception" + e.getMessage());
        } catch (Exception e) {
            System.out.println("MCQQuestionList exception" + e.getMessage());
        }

        return mCQQuestionList;

    }

    // Create a new MCQ question
    public MCQQuestion createQuestion(MCQQuestion mcqQuestion) {
        return mcqRepository.save(mcqQuestion);
    }

    // Retrieve all MCQ questions
    public List<MCQQuestion> getAllQuestions() {
        return mcqRepository.findAll();
    }

    // Retrieve a question by ID
    public MCQQuestion getQuestionById(Long id) {
        return mcqRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found"));
    }

    // Update an existing MCQ question
    public MCQQuestion updateQuestion(Long id, MCQQuestion updatedQuestion) {
        MCQQuestion existingQuestion = getQuestionById(id);
        existingQuestion.setQuestion(updatedQuestion.getQuestion());
        existingQuestion.setOptions(updatedQuestion.getOptions());
        existingQuestion.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
        return mcqRepository.save(existingQuestion);
    }

    // Delete a question by ID
    public void deleteQuestion(Long id) {
        MCQQuestion existingQuestion = getQuestionById(id);
        mcqRepository.delete(existingQuestion);
    }

    // Delete all questions
    public void deleteAllQuestions() {
        mcqRepository.deleteAll();
    }

    // Submit an answer and check correctness
    public boolean submitAnswer(Long questionId, String answer) {
        MCQQuestion question = getQuestionById(questionId);
        return question.getCorrectAnswer().equalsIgnoreCase(answer);
    }
}

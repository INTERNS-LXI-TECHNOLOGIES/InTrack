package com.lxi.QuestionManagement.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "mental_dimension")
public class MentalDimension {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String multipleChoiceQuestion;
    
    @ElementCollection
    private List<String> options; 
    
    private String hackathonQuestion;
    private String leetCodeQuestion;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMultipleChoiceQuestion() {
        return multipleChoiceQuestion;
    }

    public void setMultipleChoiceQuestion(String multipleChoiceQuestion) {
        this.multipleChoiceQuestion = multipleChoiceQuestion;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getHackathonQuestion() {
        return hackathonQuestion;
    }

    public void setHackathonQuestion(String hackathonQuestion) {
        this.hackathonQuestion = hackathonQuestion;
    }

    public String getLeetCodeQuestion() {
        return leetCodeQuestion;
    }

    public void setLeetCodeQuestion(String leetCodeQuestion) {
        this.leetCodeQuestion = leetCodeQuestion;
    }
}

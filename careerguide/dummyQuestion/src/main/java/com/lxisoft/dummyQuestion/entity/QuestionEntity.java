package com.lxisoft.dummyQuestion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class QuestionEntity{
@Id
private Long questionNumber;
private String Questions;
private String Answers;
private int points;


public Long getQuestionNumber() {
    return questionNumber;
}
public void setQuestionNumber(Long questionNumber) {
    this.questionNumber = questionNumber;
}
public String getQuestions() {
    return Questions;
}
public void setQuestions(String questions) {
    Questions = questions;
}
public String getAnswers() {
    return Answers;
}
public void setAnswers(String answers) {
    Answers = answers;
}
public int getPoints() {
    return points;
}
public void setPoints(int points) {
    this.points = points;
}

    
}
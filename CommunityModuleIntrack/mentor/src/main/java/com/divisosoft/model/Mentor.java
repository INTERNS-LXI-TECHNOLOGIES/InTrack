package com.divisosoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mentor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long internId;
private String feedback;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Long getInternId() {
    return internId;
}
public void setInternId(Long internId) {
    this.internId = internId;
}
public String getFeedback() {
    return feedback;
}
public void setFeedback(String feedback) {
    this.feedback = feedback;
}
    
}

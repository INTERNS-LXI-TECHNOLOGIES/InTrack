package com.divisosoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double performanceScore;
    private String taskProgress;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPerformanceScore() {
        return performanceScore;
    }
    public void setPerformanceScore(Double performanceScore) {
        this.performanceScore = performanceScore;
    }
    public String getTaskProgress() {
        return taskProgress;
    }
    public void setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
    }

}

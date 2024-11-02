package com.lxi.interndemmy.model;



import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TaskCompletion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskName;
    private Boolean completed;
    private LocalDate completionDate;

    @ManyToOne
    @JoinColumn(name = "intern_id", nullable = false)
    private Intern intern;
    // Getters and setters

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }
}

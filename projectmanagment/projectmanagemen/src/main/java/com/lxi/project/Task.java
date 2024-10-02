package com.lxi.project;

import jakarta.persistence.*;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String dueDate;

    @ManyToOne
    @JoinColumn(name = "project_id")  // Foreign key in Task table that refers to the Project
    private Project project;

    // Constructors
    public Task() {}

    public Task(String name, String description, String dueDate, Project project) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.project = project;
    }

    // Getters and Setters

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}

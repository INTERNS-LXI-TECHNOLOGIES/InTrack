
package com.lxi.interndemmy.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // One-to-many relationship with Attendance
    @OneToMany(mappedBy = "intern", cascade = CascadeType.ALL)
    private List<Attendance> attendanceRecords;

    // One-to-many relationship with TaskCompletion
    @OneToMany(mappedBy = "intern", cascade = CascadeType.ALL)
    private List<TaskCompletion> taskCompletions;

    // One-to-many relationship with Feedback
    @OneToMany(mappedBy = "intern", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

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
}
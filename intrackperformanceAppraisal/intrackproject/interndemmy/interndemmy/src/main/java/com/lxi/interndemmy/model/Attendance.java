package com.lxi.interndemmy.model;



import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Boolean present;

    @ManyToOne
    @JoinColumn(name = "intern_id", nullable = false)
    private Intern intern;
    
    

    // Getters and setters

    

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

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
}

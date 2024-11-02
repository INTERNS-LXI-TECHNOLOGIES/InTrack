package com.example.physicalDimension.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class InternExercise {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  /*@ManyToOne
  @JoinColumn(name = "intern_id", nullable = false)
  private Intern intern;

  @ManyToOne
  @JoinColumn(name = "exercise_id", nullable = false)
  private Exercise exercise;*/

  private String status;
  @Temporal(TemporalType.DATE)
  private Date dateAssigned;
  @Temporal(TemporalType.DATE)
  private Date dateCompleted;

    public InternExercise(Date dateAssigned, Date dateCompleted, String status) {
        this.dateAssigned = dateAssigned;
        this.dateCompleted = dateCompleted;
        this.status = status;
    }

    public InternExercise() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }*/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(Date dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

}

package com.diviso;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class PhysicalDimentional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String datetime;

    @NotNull
    private int points;

    public PhysicalDimentional(String datetime, int points) {
        this.datetime = datetime;
        this.points = points;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "PhysicalDimentional{" +
                "id=" + id +
                ", datetime='" + datetime + '\'' +
                ", points=" + points +
                '}';
    }

    // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PhysicalDimentional that = (PhysicalDimentional) o;
        return id == that.id &&
                points == that.points &&
                Objects.equals(datetime, that.datetime);
    }

    public PhysicalDimentional() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datetime, points);
    }

}

package com.divisosoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reward {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;
private String points;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getPoints() {
    return points;
}
public void setPoints(String points) {
    this.points = points;
}

    
}

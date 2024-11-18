package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
private String firstName;
private String secondName;
private String email;


public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getSecondName() {
    return secondName;
}
public void setSecondName(String secondName) {
    this.secondName = secondName;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}





}

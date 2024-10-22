package com.lxi.intern.models;

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
private long age;

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
public long getAge() {
    return age;
}
public void setAge(long age) {
    this.age = age;
}



    
}

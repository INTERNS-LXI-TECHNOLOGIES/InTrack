package com.lxisoft.intrack.careerguidance.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity{
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String userName;
private List<String> skills;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public List<String> getSkills() {
        return skills;
    }
}
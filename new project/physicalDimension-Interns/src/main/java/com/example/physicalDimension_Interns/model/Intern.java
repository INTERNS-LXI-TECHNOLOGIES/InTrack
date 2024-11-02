package com.example.physicalDimension_Interns.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Intern {
    @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long internid;
  private String name;
  private String level;
  private String email;
  private Date joinDate;

    public Intern(String email, Date joinDate, String level, String name) {
        this.email = email;
        this.joinDate = joinDate;
        this.level = level;
        this.name = name;
    }

    public Intern(){}
    
    public Long getInternid() {
        return internid;
    }

    public void setInternid(Long internid) {
        this.internid = internid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}

package com.demo.interns.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SocialChallages {
 @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id; 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private String challenge;
    public String getChallenge() {
        return challenge;
    }
    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }
    
    private String status;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public SocialChallages() {
    }
    
    public SocialChallages(String challenge,String status){
        this.challenge=challenge;
        this.status=status;
    }
    @Override
    public String toString(){
        return "challenge="+challenge+"status"+status;
    }
}

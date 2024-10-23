package com.lxisoft.spamdetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BalancedScoreCard")
public class BalancedScoreCardEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private int rankPosition;
    private String name;
    private String emailId;
    private String aadhaarNumber;
    private String pan;
    private String totalAnalizedScore;
    private String physicalScore; 
    private String mentalInvolvement;
    private String socialInvolvement;
    private String spiritualInvolvement;
    private String rewardsEarned;

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getTotalAnalizedScore() {
        return totalAnalizedScore;
    }

    public void setTotalAnalizedScore(String totalAnalizedScore) {
        this.totalAnalizedScore = totalAnalizedScore;
    }

    public String getPhysicalScore() {
        return physicalScore;
    }

    public void setPhysicalScore(String physicalScore) {
        this.physicalScore = physicalScore;
    }

    public String getMentalInvolvement() {
        return mentalInvolvement;
    }

    public void setMentalInvolvement(String mentalInvolvement) {
        this.mentalInvolvement = mentalInvolvement;
    }

    public String getSocialInvolvement() {
        return socialInvolvement;
    }

    public void setSocialInvolvement(String socialInvolvement) {
        this.socialInvolvement = socialInvolvement;
    }

    public String getSpiritualInvolvement() {
        return spiritualInvolvement;
    }

    public void setSpiritualInvolvement(String spiritualInvolvement) {
        this.spiritualInvolvement = spiritualInvolvement;
    }

    public String getRewardsEarned() {
        return rewardsEarned;
    }

    public void setRewardsEarned(String rewardsEarned) {
        this.rewardsEarned = rewardsEarned;
    }

    public int getRankPosition() {
        return rankPosition;
    }

    public void setRankPosition(int rankPosition) {
        this.rankPosition = rankPosition;
    }
    

    
}
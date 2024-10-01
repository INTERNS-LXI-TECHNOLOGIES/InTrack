package com.lxi.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Reward{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO )
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    private String Rewardname;

    public String getRewardname() {
        return Rewardname;
    }

    public void setRewardname(String Rewardname) {
        this.Rewardname = Rewardname;
    }

    @NotNull
    private String Rewardpoints;

    public String getRewardpoints() {
        return Rewardpoints;
    }

    public void setRewardpoints(String Rewardpoints) {
        this.Rewardpoints = Rewardpoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reward)) return false;

        return getId().equals(((Reward) o).getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", rewardname='" + Rewardname + '\'' +
                ", rewardpoints='" + Rewardpoints + '\'' +
                '}';
    }
}

    






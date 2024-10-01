package com.divisosoft.reward;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Reward {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@NotNull
private String rewardName;

@NotNull
private String rewardPoints;


public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getRewardName() {
    return rewardName;
}

public void setRewardName(String rewardName ) {
    this.rewardName = rewardName;
    
}

public String getRewardPoints() {
    return rewardPoints;
}

public void setRewardPoints(String rewardPoints) {
    this.rewardPoints = rewardPoints;
}


public Reward(String rewardName,String rewardPoints){
    this.rewardName=rewardName;
    this.rewardPoints=rewardPoints;

}

public Reward()
{}

@Override
public boolean equals(Object o){
    if(this == o)return true;
    if(!(o instanceof Reward)) return false;

    return getId().equals( ((Reward) o).getId() ); 
}

@Override
public int hashCode(){
   return getId().hashCode();

}

@Override
public String toString(){
    return "ID:"+id+"RewardName:"+rewardName +"RewardPoints:"+rewardPoints;
}

}

package com.demo.interns.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Interns")
public class InternEntity {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id; 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    private String emailid;
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
   

    
    public InternEntity() {
    }
    
    public InternEntity(String name,String emailid){
        this.name=name;
        this.emailid=emailid;
    }
    @Override
    public String toString(){
        return "name="+name+"Emailid"+emailid;
    }
}








































         
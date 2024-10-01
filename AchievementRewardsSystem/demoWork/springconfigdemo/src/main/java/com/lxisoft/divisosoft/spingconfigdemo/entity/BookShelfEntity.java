package com.lxisoft.divisosoft.spingconfigdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookShelfEntity{
    
    @Id
    private long id;
    private String name;

    public BookShelfEntity(long id,String name){
        this.id =id;
        this.name =name;
    }

    public BookShelfEntity(){
        
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}
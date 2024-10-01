package com.lxi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String adminName;
private String email;
private String password;


public void setAdminName(String adminName) {
    this.adminName = adminName;
}
public String getAdminName() {
        return adminName;
}

public void setEmail(String email) {
    this.email = email;
}

public String getEmail() {
    return email;
}

public void setPassword(String password) {
    this.password = password;
}

public String getPassword() {
    return password;
}

public Admin(){
    
}


public Admin(String adminName, String  email, String password){
    this.adminName = adminName;
    this.email = email;
    this.password = password;
}


@override
public String toString(){
    return "Admin id" + id + ", AdminName='" + adminName + '\'' + ", AdminName='" + email + ", password='" + password;
}
    
}
package com.lxisoft.intrack.careerguidance.controller;

import java.util.List;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.QuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.intrack.careerguidance.entity.UserEntity;
import com.lxisoft.intrack.careerguidance.service.UserService;

@RestController
@RequestMapping("/")
public class UserControl{
    
    @Autowired
    private UserService userService;

@GetMapping("/show")
    public List<QuestionEntity> bringDatas() throws ApiException{
        return userService.questionShow();
    }

    @PostMapping("/create")
    public void saveUser(@RequestBody UserEntity userEntity){
        userService.createUser(userEntity);
    }

    @GetMapping("/read")
    public List<UserEntity> searching(){
        return userService.showUsers();
    }

    @PutMapping("/update/{id}")
    public UserEntity updating(@PathVariable Long id , @RequestBody UserEntity userEntity){
        return userService.updateUser(id , userEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteing(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
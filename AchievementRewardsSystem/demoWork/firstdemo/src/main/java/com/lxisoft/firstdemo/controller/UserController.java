package com.lxisoft.firstdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.firstdemo.entity.UserEntity;
import com.lxisoft.firstdemo.services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/api/create")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userServices.saveUser(user);
    }

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userServices.getAllUsers();
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity updatedUser) {
        return userServices.updateUser(id, updatedUser);
    }
    

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userServices.deleteUserById(id);
    }
}

package com.lxisoft.firstdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.firstdemo.entity.UserEntity;
import com.lxisoft.firstdemo.repository.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

   public UserEntity updateUser(Long id, UserEntity updatedUser) {
        UserEntity existingUser = userRepository.findById(id).orElse(null);

    if (existingUser == null) {
        throw new RuntimeException("User not found with ID: " + id);
    }

    existingUser.setUserName(updatedUser.getUserName());
    existingUser.setAge(updatedUser.getAge());
    
    return userRepository.save(existingUser);
}


    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}

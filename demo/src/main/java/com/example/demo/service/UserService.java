
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
    @Autowired
UserRepo userRepo;

public User createUser(User user){
    return userRepo.save(user);
}

public List<User> getAllUsers(){
return userRepo.findAll();
}

public Optional<User> getUsersById(Long id){
    return userRepo.findById(id);

}

public User updateUser(Long id, User updatedUser){
Optional<User> optionalUser = userRepo.findById(id);
 if(optionalUser.isPresent()){
User existingUser = optionalUser.get();
existingUser.setName(updatedUser.getName());
existingUser.setEmail(updatedUser.getEmail());
return userRepo.save(existingUser);
    }
    return null;
}

public void deleteUser(Long id){
     userRepo.deleteById(id);
}

}
package com.lxisoft.firstdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.UserControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.firstdemo.repository.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<org.openapitools.client.model.UserEntity> getUsers() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");
        
        List<org.openapitools.client.model.UserEntity> userList =new ArrayList<>();
        UserControllerApi userControllerApi = new UserControllerApi(apiClient);
        try{
             userList = userControllerApi.getAllUsers();
        }
        catch(ApiException e)
        {
            e.getMessage();
        }
        return userList;

}

 public com.lxisoft.firstdemo.entity.UserEntity save(com.lxisoft.firstdemo.entity.UserEntity user){
    return userRepository.save(user);
 }

   /* public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }*/

   public com.lxisoft.firstdemo.entity.UserEntity updateUser(Long id, com.lxisoft.firstdemo.entity.UserEntity updatedUser) {
       com.lxisoft.firstdemo.entity. UserEntity existingUser = userRepository.findById(id).orElse(null);

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


package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.UserControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
    @Autowired
UserRepo userRepo;



public List<org.openapitools.client.model.User> getInterns() {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("http://localhost:8081");

    UserControllerApi userControllerApi = new UserControllerApi(apiClient);
    List<org.openapitools.client.model.User> result = new ArrayList<>();

    try {
        result = userControllerApi.getAllUsers();
    } catch (ApiException e) {
        // Log the error message
        System.err.println("API Exception: " + e.getMessage());
        // You may want to rethrow the exception or handle it as needed
    } catch (Exception e) {
        // Handle any other exceptions that may occur
        System.err.println("Unexpected error: " + e.getMessage());
    }

    return result;
}


    public User createUser(User user){
        return userRepo.save(user);
    }

            public List<User> getAllUsers(){
            return userRepo.findAll();
            }

                    public Optional<User> getUsersById(Long id){
                        return userRepo.findById(id);

                    }
                            public Optional<User>getUserByName(String name){
                                return userRepo.findByName(name);
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
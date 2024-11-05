package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

            // Create a new user
            @PostMapping("/create")
            public User postUser(@RequestBody User user){
            System.out.println("Received user: " + user);
            return userService.createUser(user);
        }

                // Get all users
                @GetMapping("/showAll")
                public List<User>getAllUsers() {
                    return  userService.getAllUsers();   
                }

                        // Get a user by ID
                        @GetMapping("/{id}")
                        public User getUserById(@PathVariable Long id) {
                            return userService.getUsersById(id).orElse(null);
                        }

                                @GetMapping("/name/{name}")
                                public User geUserByName(@PathVariable String name){
                                Optional<User> user = userService.getUserByName(name);
                                return user.orElse(null);
                                }

                                        // Update a user by ID
                                        @PutMapping("/{id}")
                                        public User putUser(@PathVariable Long id, @RequestBody User user){
                                            return userService.updateUser(id,user);
                                        }

                                                    @DeleteMapping("/{id}")
                                                    public void deletUser(@PathVariable Long id ){
                                                        userService.deleteUser(id);
                                                    }
    
}
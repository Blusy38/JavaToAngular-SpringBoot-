package com.Learning.JavaToAngular.Controller;

import com.Learning.JavaToAngular.Repository.UserRepository;
import com.Learning.JavaToAngular.model.User;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Implement the REST API with a REST controller
@RestController

//The @CrossOrigin annotation enables cross-origin resource sharing (CORS) on the server.
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    
    private final UserRepository userRepository;
    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
 
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
package com.projects.simplecrud.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projects.simplecrud.model.Users;
import com.projects.simplecrud.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService; 
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    
    @GetMapping("")
    public List<Users> getUsers(){
        return userService.getUsers(); 
    }

    // https://spring.io/guides/gs/rest-service-cors/
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("")
    public void saveUser(@RequestBody Users user){
        userService.saveUser(user); 
    }

    


}

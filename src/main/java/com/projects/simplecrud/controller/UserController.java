package com.projects.simplecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.simplecrud.model.Users;
import com.projects.simplecrud.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService; 

    @GetMapping("")
    public List<Users> getUsers(){
        return userService.getUsers(); 
    }



}

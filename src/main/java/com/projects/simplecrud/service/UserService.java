package com.projects.simplecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.simplecrud.model.Users;
import com.projects.simplecrud.repository.UserRepository;

@Service 
public class UserService {
    @Autowired
    UserRepository userRepository; 
    public List<Users> getUsers(){
        return userRepository.findAll(); 
    }
}

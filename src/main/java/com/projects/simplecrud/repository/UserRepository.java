package com.projects.simplecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.simplecrud.model.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {
    
}

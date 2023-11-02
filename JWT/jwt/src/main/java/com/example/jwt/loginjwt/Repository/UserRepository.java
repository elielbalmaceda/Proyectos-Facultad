package com.example.jwt.loginjwt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jwt.loginjwt.User.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long> {
//  QUERY methods;
    Optional<User> findUsername(String username);
} 
    

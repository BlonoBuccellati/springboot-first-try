package com.example.demo.service;

import com.example.demo.repository.IUserRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final IUserRepository userRepository;
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public String getUser() {
        return userRepository.getUser();
    }
}

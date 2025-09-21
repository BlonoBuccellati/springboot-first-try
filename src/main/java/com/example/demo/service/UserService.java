package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User getUserByName(String name) {
        return userRepository.findByName(name)
                .orElse(null);
    }

    public User addUser(String name) {
        return userRepository.save(new User(name));
    }
}

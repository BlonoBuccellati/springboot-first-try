package com.example.demo.service;

import com.example.demo.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final IUserRepository userRepository;
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<String> getUsers() {
        return userRepository.getUsers();
    }
    public String getUserById(int id) {
        return "name";
    }

    public String addUser(String name) {
        return "登録成功";
    }
}

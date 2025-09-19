package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {
    @Override
    public String getUser() {
        return "user repository";
    }
}

package com.example.demo;

import com.example.demo.service.HelloService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    private final HelloService helloService;
    private final UserService userService;
    @Autowired
    public UserController(HelloService helloService, UserService userService) {
        this.helloService = helloService;
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }
    @GetMapping("/users")
    public String getUsers() {
        return userService.getUser();
    }

    @PostMapping("/users")
    public String createUser() {
        return "ユーザ作成";
    }
}
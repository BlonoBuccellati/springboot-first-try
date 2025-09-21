package com.example.demo;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.UserRequest;
import com.example.demo.service.HelloService;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ApiResponse<List<String>> getUsers() {
        return ApiResponse.success(userService.getUsers());
    }
    @GetMapping("/users/{id}")
    public ApiResponse<String> getUser(@PathVariable int id) {
        return ApiResponse.success(userService.getUserById(id));
    }

    @PostMapping("/users")
    public String createUser(@RequestBody @Valid  UserRequest request) {
        return userService.addUser(request.getName());
    }


}
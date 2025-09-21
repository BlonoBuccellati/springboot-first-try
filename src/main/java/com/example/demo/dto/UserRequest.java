package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequest {
    @NotBlank(message = "名前は必須です")
    @Size(min = 2, max = 20, message = "名前は2-20文字で入力してください")
    private String name;

    public String getName() { return name; }
    public void changeName(String name) { this.name = name; }
}

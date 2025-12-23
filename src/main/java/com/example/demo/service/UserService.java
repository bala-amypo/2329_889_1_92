package com.example.demo.service;

import com.example.demo.models.UserModels;

public interface UserService {

    UserModels register(UserModels user);

    UserModels login(String email);
}

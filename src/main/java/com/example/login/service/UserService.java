package com.example.login.service;

import com.example.login.model.User;

public interface UserService {
    User findUserByEmail(String email);
    void saveUser(User user);
}

package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;

public interface UserService {
    int addUser(User user);

    boolean checkLogin(User user);

}

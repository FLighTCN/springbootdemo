package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value ="/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping(value = "/add",produces = {"application/json;charset=UTF-8"})
    public int userRegister(User user){
        return userService.addUser(user);
    }
    @RequestMapping(value = "/login",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public boolean userLogin(User user){
        return userService.checkLogin(user);
    }

}

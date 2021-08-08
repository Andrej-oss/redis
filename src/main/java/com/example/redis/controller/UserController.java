package com.example.redis.controller;

import com.example.redis.entity.User;
import com.example.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/{id}/{name}")
    public User saveUser(@PathVariable String id,@PathVariable String name){
        userService.save(new User(id, name, "3000"));
        return userService.finById(id);
    }
    @PutMapping("/{id}/{name}")
    public User updateUser(@PathVariable String id,@PathVariable String name){
            userService.save(new User(id, name, "7000"));
            return userService.finById(id);
    }
    @GetMapping
    public Map<String, User> findAllUsers(){
        return userService.getAll();
    }
}

package com.example.redis.service;

import com.example.redis.entity.User;

import java.util.Map;

public interface UserService {

    Map<String, User> getAll();
    User finById(String id);
    void save(User user);
    void updateUser(User user);
    void delete(String id);
}

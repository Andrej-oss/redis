package com.example.redis.service.impl;

import com.example.redis.entity.User;
import com.example.redis.service.UserService;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class UserServiceImpl implements UserService {

    private RedisTemplate<String, User> redisTemplate;
    private HashOperations hashOperations;

    public UserServiceImpl(RedisTemplate<String, User> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public Map<String, User> getAll() {
        return hashOperations.entries("user");
    }

    @Override
    public User finById(String id) {
        return (User) hashOperations.get("user", id);
    }

    @Override
    public void save(User user) {
        hashOperations.put("user", user.getId(), user);
    }

    @Override
    public void updateUser(User user) {
        save(user);
    }

    @Override
    public void delete(String id) {
        hashOperations.delete("user", id);
    }
}

package com.zh.service;

import com.zh.model.User;

import java.util.List;

public interface UserService {

     User login(User user);

     List<User> findAll();

     int add(User user);

     int delete(int uid);

     int update(User user);
}

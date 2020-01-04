package com.zh.dao;

import com.zh.model.User;

import java.util.List;

public interface UserDao {

     User login(User user);

     List<User> findAll();

     int add(User user);

     int delete(int uid);

     int update(User user);

}

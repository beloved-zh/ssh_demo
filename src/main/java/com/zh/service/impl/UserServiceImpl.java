package com.zh.service.impl;

import com.zh.dao.UserDao;
import com.zh.model.User;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional  //事务
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public int delete(int uid) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }
}

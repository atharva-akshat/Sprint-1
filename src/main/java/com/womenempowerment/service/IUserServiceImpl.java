package com.womenempowerment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.womenempowerment.dao.IUserDao;
import com.womenempowerment.entity.User;

@Service
public class IUserServiceImpl implements IUserService{
    @Autowired
    IUserDao dao;

    @Override
    public User registerUser(User user) {
        return dao.save(user);
    }

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User forgotPassword(User user) {
        return null;
    }
}
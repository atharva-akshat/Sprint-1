package com.womenempowerment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.womenempowerment.dao.IUserDao;
import com.womenempowerment.dto.IForgotPasswordUserDto;
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
        return dao.login(username, password);
    }

    @Override
    public User forgotPassword(String username, IForgotPasswordUserDto password) {
        User user= dao.findByUsername(username);
        if(user==null)
        	return user;
        user.setUserPassword(password.getPassword());
        return dao.save(user);
    }
}
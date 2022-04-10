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
        return dao.authenticateUser(username, password);
    }

    @Override
    public User forgotPassword(String username, IForgotPasswordUserDto password) {
        User user= dao.authenticateUser(username, password.getOldPassword());
        if(user==null)
        	return user;
        user.setUserPassword(password.getNewPassword());
        return dao.save(user);
    }
}
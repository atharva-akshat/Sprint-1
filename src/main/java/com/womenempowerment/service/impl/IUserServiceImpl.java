package com.womenempowerment.service.impl;

import com.womenempowerment.dao.IUserDao;
import com.womenempowerment.dto.IForgotPasswordUserDto;
import com.womenempowerment.dto.IUserDto;
import com.womenempowerment.entity.User;
import com.womenempowerment.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    IUserDao dao;

    @Override
    public User registerUser(IUserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setUserPassword(userDto.getUserPassword());
        return dao.save(user);
    }

    @Override
    public User login(String username, String password) {
        return dao.authenticateUser(username, password);
    }

    @Override
    public User forgotPassword(String username, IForgotPasswordUserDto password) {
        User user = dao.authenticateUser(username, password.getOldPassword());
        if (user == null)
            return null;
        user.setUserPassword(password.getNewPassword());
        return dao.save(user);
    }
}
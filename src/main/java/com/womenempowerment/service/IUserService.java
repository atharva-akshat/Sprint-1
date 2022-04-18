package com.womenempowerment.service;

import com.womenempowerment.dto.IForgotPasswordUserDto;
import com.womenempowerment.entity.User;

public interface IUserService {
    User registerUser(IUserDto userDto);

    User login(String username, String password);

    User forgotPassword(String username, IForgotPasswordUserDto password);

}

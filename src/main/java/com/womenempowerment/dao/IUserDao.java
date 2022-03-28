package com.womenempowerment.dao;

import com.womenempowerment.entity.User;

public interface IUserDao {
	User registerUser(User user);

	User login(String username, String password);

	User forgotPassword(User user);

}

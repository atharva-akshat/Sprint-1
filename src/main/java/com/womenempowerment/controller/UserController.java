package com.womenempowerment.controller;

import com.womenempowerment.dto.IForgotPasswordUserDto;
import com.womenempowerment.dto.IUserDto;
import com.womenempowerment.entity.User;
import com.womenempowerment.exception.InvalidUserException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.womenempowerment.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService service;
    
	@PostMapping("/register")
	public ResponseEntity<String> addUser(@Validated @RequestBody User user) {
		service.registerUser(user);
		return new ResponseEntity<String>("User added", HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody IUserDto user){
		User u= service.login(user.getUsername(), user.getPassword());
		if(u==null)
			throw new InvalidUserException();
		return new ResponseEntity<String>("Welcome "+u.getUserName(), HttpStatus.OK);
	}
	
	@PutMapping("/forgotPassword/{username}")
	public ResponseEntity<String> forgotPassword(@PathVariable String username,@RequestBody IForgotPasswordUserDto user){
		User u= service.forgotPassword(username, user);
		if(u==null)
			throw new InvalidUserException();
		return new ResponseEntity<String>("Password Recovered!", HttpStatus.OK);
	}

}

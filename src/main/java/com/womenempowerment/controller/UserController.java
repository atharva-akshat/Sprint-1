package com.womenempowerment.controller;

import com.womenempowerment.dto.IForgotPasswordUserDto;
import com.womenempowerment.dto.IUserDto;
import com.womenempowerment.entity.User;
import com.womenempowerment.exception.InvalidUserException;
import com.womenempowerment.exception.UserAlreadyExistsException;
import com.womenempowerment.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService service;

    @PostMapping("/register")
    public ResponseEntity<String> addUser(@Validated @RequestBody User user) {
        if (service.login(user.getUserName(), user.getUserPassword()) != null)
            throw new UserAlreadyExistsException();
        service.registerUser(user);
        return new ResponseEntity<>("User added", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody IUserDto userDto) {
        User user = service.login(userDto.getUsername(), userDto.getPassword());
        if (user == null)
            throw new InvalidUserException();
        return new ResponseEntity<>("Welcome " + user.getUserName(), HttpStatus.OK);
    }

    @PutMapping("/forgotPassword")
    public ResponseEntity<String> forgotPassword(@RequestBody String username, @RequestBody IForgotPasswordUserDto userDto) {
        User user = service.forgotPassword(username, userDto);
        if (user == null)
            throw new InvalidUserException();
        return new ResponseEntity<>("Password Recovered!", HttpStatus.OK);
    }

}

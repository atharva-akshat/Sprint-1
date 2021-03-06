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
    public ResponseEntity<String> addUser(@Validated @RequestBody IUserDto userDto) {
        if (service.login(userDto.getUserName(), userDto.getUserPassword()) != null)
            throw new UserAlreadyExistsException();
        service.registerUser(userDto);
        return new ResponseEntity<>("User added", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody IUserDto userDto) {
        User user = service.login(userDto.getUserName(), userDto.getUserPassword());
        if (user == null)
            throw new InvalidUserException();
        return new ResponseEntity<>("Welcome " + user.getUserName(), HttpStatus.OK);
    }

    @PutMapping("/forgotPassword/")
    public ResponseEntity<String> forgotPassword(@RequestBody String username, IForgotPasswordUserDto userDto) {
        User user = service.forgotPassword(username, userDto);
        if (user == null)
            throw new InvalidUserException();
        return new ResponseEntity<>("Password Recovered!", HttpStatus.OK);
    }

}

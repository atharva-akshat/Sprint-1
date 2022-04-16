package com.womenempowerment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    private int loginId;
    @Column(length = 15)
    @Size(min = 2, max = 15, message = "Username must be between 2 and 15 characters long")
    private String userName;
    @Column(length = 15)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#!$%^&\\-+=()])(?=\\S+$).{4,15}$", message = "Password must contain atleast one capital letter, one small letter, one digit, one special character and should be atleast 4 characters long")
    private String userPassword;
    
    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User [loginId=" + loginId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
    }
}


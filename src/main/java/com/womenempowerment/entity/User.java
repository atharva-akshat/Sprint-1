package com.womenempowerment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	private int loginId;
	@Column(length = 15)
	@Size(min=4, max=20, message = "Username must be between 4 and 20 characters long")
	private String userName;
	@Column(length = 15)
	private String userPassword;
	
	
	//Getters and setters
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


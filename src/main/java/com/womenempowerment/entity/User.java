package com.womenempowerment.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@Column(length = 4)
	private int loginId;
	@Column(length = 10)
	private String userName;
	@Column(length = 10)
	private String userPassword;
	
	@OneToMany(mappedBy="users",cascade=CascadeType.ALL)
	private List<FeedBack> feedBacks;
	
	
	
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
	public List<FeedBack> getFeedBacks() {
		return feedBacks;
	}
	public void setFeedBacks(List<FeedBack> feedBacks) {
		this.feedBacks = feedBacks;
	}
}


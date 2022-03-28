package com.womenempowerment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(length = 4)
	private int loginId;
	@Column(length = 10)
	private String userName;
	@Column(length = 10)
	private String userPassword;
}


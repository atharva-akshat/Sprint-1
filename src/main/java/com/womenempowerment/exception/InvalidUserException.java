package com.womenempowerment.exception;

public class InvalidUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public InvalidUserException() {
		super("Invalid User Credentials");
	}
	
}

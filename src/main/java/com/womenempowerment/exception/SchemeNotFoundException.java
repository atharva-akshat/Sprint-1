package com.womenempowerment.exception;

public class SchemeNotFoundException extends RuntimeException{
	private static final long serialVersionUID=1L;
	public SchemeNotFoundException() {
		super("Scheme does not exist!");
	}
}

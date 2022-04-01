package com.womenempowerment.exception;

public class NGOAlreadyExistsException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public NGOAlreadyExistsException() {
        super("NGO by that ID already exists!");
    }
}

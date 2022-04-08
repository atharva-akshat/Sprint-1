package com.womenempowerment.exception;

public class TraineeAlreadyExistsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TraineeAlreadyExistsException() {
        super("User already exists!");
    }

}


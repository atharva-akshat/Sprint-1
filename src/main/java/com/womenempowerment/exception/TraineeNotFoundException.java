package com.womenempowerment.exception;

public class TraineeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TraineeNotFoundException() {
        super("Trainee does not exist!");
    }
}

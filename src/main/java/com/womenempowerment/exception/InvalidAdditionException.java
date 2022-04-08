package com.womenempowerment.exception;

public class InvalidAdditionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidAdditionException() {
        super("Invalid details!");
    }
}

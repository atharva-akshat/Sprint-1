package com.womenempowerment.exception;

public class SchemeAlreadyExistsException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public SchemeAlreadyExistsException() {
        super("Scheme already exists!");
    }
}

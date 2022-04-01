package com.womenempowerment.exception;

public class NGONotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NGONotFoundException() {
        super("NGO does not exist!");
    }
}

package com.womenempowerment.exception;

public class FeedBackAlreadyExistsException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FeedBackAlreadyExistsException() {
        super("FeedBack already exist!");
    }
}

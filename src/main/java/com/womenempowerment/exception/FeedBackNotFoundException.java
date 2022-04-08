package com.womenempowerment.exception;

public class FeedBackNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FeedBackNotFoundException() {
        super("FeedBack does not exist!");
    }
}

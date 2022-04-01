package com.womenempowerment.exception;

public class TrainingCourseNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TrainingCourseNotFoundException() {
        super("Course does not exist!");
    }
}

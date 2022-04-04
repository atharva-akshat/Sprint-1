package com.womenempowerment.exception;

public class TrainingCourseAlreadyExistsException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public TrainingCourseAlreadyExistsException() {
        super("Course already exists!");
    }
}

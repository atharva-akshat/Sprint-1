package com.womenempowerment.utils;

import com.womenempowerment.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MainExceptionHandler {
    @ExceptionHandler(value = InvalidUserException.class)
    public ResponseEntity<Object> exception(InvalidUserException ex) {
        System.out.println(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = NGONotFoundException.class)
    public ResponseEntity<Object> exception(NGONotFoundException ex) {
        System.out.println(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = TrainingCourseNotFoundException.class)
    public ResponseEntity<Object> exception(TrainingCourseNotFoundException ex) {
        System.out.println(ex.getMessage());
        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = FeedBackNotFoundException.class)
    public ResponseEntity<Object> exception(FeedBackNotFoundException ex) {
        System.out.println(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = FeedBackAlreadyExistsException.class)
    public ResponseEntity<Object> exception(FeedBackAlreadyExistsException ex) {
        System.out.println(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = SchemeNotFoundException.class)
    public ResponseEntity<Object> exception(SchemeNotFoundException ex) {
        System.out.println(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
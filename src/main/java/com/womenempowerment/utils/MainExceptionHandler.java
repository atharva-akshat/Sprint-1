package com.womenempowerment.utils;

import com.womenempowerment.exception.InvalidUserException;
import com.womenempowerment.exception.NGONotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MainExceptionHandler {
    @ExceptionHandler(value = InvalidUserException.class)
    public ResponseEntity<Object> exception(InvalidUserException ex){
        System.out.println(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = NGONotFoundException.class)
    public ResponseEntity<Object> exception(NGONotFoundException ex){
        System.out.println(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}

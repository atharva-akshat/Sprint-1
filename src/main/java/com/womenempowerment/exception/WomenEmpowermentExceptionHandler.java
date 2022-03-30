package com.womenempowerment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WomenEmpowermentExceptionHandler {
	@ExceptionHandler(value = TrainingCourseNotFoundException.class)
	public ResponseEntity<Object> exception(TrainingCourseNotFoundException ex){
		System.out.println(ex.getMessage());
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}

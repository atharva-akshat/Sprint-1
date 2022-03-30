package com.womenempowerment.controller;

import com.womenempowerment.entity.Scheme;
import com.womenempowerment.service.ISchemeServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/scheme")
public class SchemeController {
	@Autowired
	ISchemeServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addTrainee(@RequestBody Scheme scheme){
		service.addScheme(scheme);
		return new ResponseEntity<String>("Scheme Added!", HttpStatus.OK);
	}
}

package com.womenempowerment.controller;

import com.womenempowerment.dao.ISchemeDao;
import com.womenempowerment.dto.ISchemeDto;
import com.womenempowerment.entity.Scheme;
import com.womenempowerment.exception.SchemeNotFoundException;
import com.womenempowerment.service.ISchemeServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/scheme")
public class SchemeController {
	@Autowired
	ISchemeServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addScheme(@RequestBody ISchemeDto scheme){
		service.addScheme(scheme);
		return new ResponseEntity<String>("Scheme Added!", HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<String> viewAll(){
		return new ResponseEntity<String>(service.viewAllScheme().toString(), HttpStatus.OK);
	}
	
	@GetMapping("/viewById/{id}")
	public ResponseEntity<String> viewById(@PathVariable int id){
		Scheme scheme= service.viewScheme(id);
		if(scheme==null)
			throw new SchemeNotFoundException();
		return new ResponseEntity<String>(scheme.toString(), HttpStatus.OK);
	}
}

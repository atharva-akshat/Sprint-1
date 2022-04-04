package com.womenempowerment.controller;

import com.womenempowerment.dto.ISchemeDto;
import com.womenempowerment.entity.Scheme;
import com.womenempowerment.exception.SchemeAlreadyExistsException;
import com.womenempowerment.exception.SchemeNotFoundException;
import com.womenempowerment.service.ISchemeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/scheme")
public class SchemeController {
	@Autowired
	ISchemeServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addScheme(@RequestBody ISchemeDto scheme){
		if (service.viewScheme(scheme.getSchemeId())!=null)
			throw new SchemeAlreadyExistsException();
		service.addScheme(scheme);
		return new ResponseEntity<>("Scheme Added!", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateScheme(@RequestBody ISchemeDto scheme){
		if(service.viewScheme(scheme.getSchemeId())==null)
			throw new SchemeNotFoundException();
		service.updateScheme(scheme);
		return new ResponseEntity<>("Scheme Updated!",HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<String> viewAllSchemes(){
		List<Scheme> scheme=service.viewAllScheme();
		if(scheme.isEmpty())
			throw new SchemeNotFoundException();
		return new ResponseEntity<>(scheme.toString(), HttpStatus.OK);
	}
	
	@GetMapping("/viewById/{id}")
	public ResponseEntity<String> viewById(@PathVariable int id){
		Scheme scheme= service.viewScheme(id);
		if(scheme==null)
			throw new SchemeNotFoundException();
		return new ResponseEntity<>(scheme.toString(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteScheme(@RequestBody int id){
		Scheme scheme=service.viewScheme(id);
		if(scheme==null)
			throw new SchemeNotFoundException();
		service.deleteScheme(id);
		return new ResponseEntity<>("Scheme deleted!",HttpStatus.OK);
	}
	
	@GetMapping("/viewByType{type}")
	public ResponseEntity<String> getSchemeByType(@PathVariable String type){
		List<Scheme> scheme=service.viewSchemesByType(type);
		if(scheme.isEmpty())
			throw new SchemeNotFoundException();
		return new ResponseEntity<>(scheme.toString(),HttpStatus.OK);
	}
	
	@GetMapping("/viewByLaunchDate{launchdate}")
	public ResponseEntity<String> getSchemeByLaunchDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate launchdate){
		List<Scheme> scheme=service.viewSchemeByLaunchDate(launchdate);
		if(scheme.isEmpty())
			throw new SchemeNotFoundException();
		return new ResponseEntity<>(scheme.toString(),HttpStatus.OK);
	}
}

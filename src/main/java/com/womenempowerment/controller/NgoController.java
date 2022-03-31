package com.womenempowerment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.womenempowerment.dto.INgoDto;
//import com.womenempowerment.dto.INgoDto;
import com.womenempowerment.entity.NGO;
import com.womenempowerment.entity.TrainingCourse;
import com.womenempowerment.exception.NGONotFoundException;
import com.womenempowerment.exception.TrainingCourseNotFoundException;
import com.womenempowerment.service.INGOService;
//import com.womenempowerment.service.INGOServiceImpl;



@RestController
@RequestMapping("/ngo")
public class NgoController {
	
	@Autowired
	INGOService ngoservice;
	
	@PostMapping("/add")
	public ResponseEntity<String> addNgo(@RequestBody INgoDto dto){
		ngoservice.addNGO(dto);
		return new ResponseEntity<String>("Ngo Added!", HttpStatus.OK);
	}
	
	@GetMapping("/viewById/{id}")
	public ResponseEntity<String> getNgoById(@PathVariable int id) {
		NGO dto = ngoservice.viewNGO(id);
		if(dto==null)
			throw new NGONotFoundException();
		return new ResponseEntity<String>(dto.toString(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{ngoId}")
	public ResponseEntity<String> deleteNGO(@PathVariable int ngoId){
		NGO ngo = ngoservice.viewNGO(ngoId);
		if(ngo==null)
			throw new NGONotFoundException();
		ngoservice.deleteNGO(ngoId);
		return new ResponseEntity<String>("Ngo deleted", HttpStatus.OK);
	}

}

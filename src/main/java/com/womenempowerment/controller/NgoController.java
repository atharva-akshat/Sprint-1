package com.womenempowerment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.womenempowerment.dto.INgoDto;
//import com.womenempowerment.dto.INgoDto;
import com.womenempowerment.entity.NGO;
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
}

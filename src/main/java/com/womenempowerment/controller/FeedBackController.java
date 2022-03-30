package com.womenempowerment.controller;

import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.entity.FeedBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.womenempowerment.service.IFeedBackService;

import java.util.List;

@RestController
@RequestMapping("/feedBack")
public class FeedBackController {
	@Autowired
	IFeedBackService feedBackService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addFeedBack(@RequestBody IFeedBackDto feedBack){
		feedBackService.addFeedBack(feedBack);
		return new ResponseEntity<String>("Feedback Added..",HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<FeedBack>> viewAllFeedBack(){
		return new ResponseEntity<>(feedBackService.viewAllFeedBack(),HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<FeedBack> viewFeedBack(@PathVariable int id){
		return new ResponseEntity<>(feedBackService.viewFeedBack(id),HttpStatus.OK);
	}
	
	@GetMapping("/{schemeName}")
	public ResponseEntity<List<FeedBack>> viewFeedBackBySchemeName(@PathVariable String schemeName){
		return new ResponseEntity<>(feedBackService.viewFeedBackBySchemeName(schemeName),HttpStatus.OK);
	}
	
	@GetMapping("/{trainingCourseName}")
	public ResponseEntity<List<FeedBack>> viewFeedBackByTrainingCourseName(@PathVariable String trainingCourseName){
		return new ResponseEntity<>(feedBackService.viewFeedBackByTrainingCourseName(trainingCourseName),HttpStatus.OK);
	}
}

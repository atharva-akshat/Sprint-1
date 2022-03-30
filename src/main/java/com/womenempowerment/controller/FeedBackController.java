package com.womenempowerment.controller;

import com.womenempowerment.dto.IFeedBackDto;
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

	@GetMapping("/view")
	public ResponseEntity<String> viewAllFeedBack(){
		return new ResponseEntity<>(feedBackService.viewAllFeedBack().toString(),HttpStatus.OK);
	}

	@GetMapping("/id-{id}")
	public ResponseEntity<String> viewFeedBack(@PathVariable int id){
		return new ResponseEntity<>(feedBackService.viewFeedBack(id).toString(),HttpStatus.OK);
	}

	@GetMapping("/sc-{scheme}")
	public ResponseEntity<String> viewFeedBackBySchemeName(@PathVariable String scheme){
		return new ResponseEntity<>(feedBackService.viewFeedBackBySchemeName(scheme).toString(),HttpStatus.OK);
	}
	@GetMapping("/cs-{course}")
	public ResponseEntity<String> viewFeedBackByTrainingCourseName(@PathVariable String course){
		return new ResponseEntity<>(feedBackService.viewFeedBackByTrainingCourseName(course).toString(),HttpStatus.OK);
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

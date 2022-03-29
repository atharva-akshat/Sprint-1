package com.womenempowerment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.womenempowerment.entity.FeedBack;
import com.womenempowerment.service.IFeedBackService;

@RestController
@RequestMapping("/feedBack")
public class FeedBackController {
	@Autowired
	IFeedBackService feedBackService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addFeedBack(@RequestBody FeedBack feedBack){
		feedBackService.addFeedBack(feedBack);
		return new ResponseEntity<String>("Feedback Added..",HttpStatus.OK);
	}
}

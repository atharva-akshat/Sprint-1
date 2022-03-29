package com.womenempowerment.controller;

import com.womenempowerment.entity.Trainee;
import com.womenempowerment.service.ITraineeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/trainee")
public class TraineeController {
    @Autowired
    ITraineeServiceImpl service;

    @PostMapping("/add")
    public ResponseEntity<String> addTrainee(@RequestBody Trainee trainee){
        service.addTrainee(trainee);
        return new ResponseEntity<String>("Trainee Added!", HttpStatus.OK);
    }
}


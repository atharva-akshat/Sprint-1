package com.womenempowerment.controller;

import com.womenempowerment.entity.TrainingCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.womenempowerment.service.ITrainingCourseService;

@RestController
@RequestMapping("/trainingCourse")
public class TrainingCourseController {
    @Autowired
    ITrainingCourseService service;

    @PostMapping("/add")
    public String addCourse(@RequestBody TrainingCourse course) {
        service.addTrainingCourse(course);
        return "Course added";
    }
}

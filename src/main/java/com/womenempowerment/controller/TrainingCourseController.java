package com.womenempowerment.controller;

import com.womenempowerment.dto.ITrainingCourseDto;
import com.womenempowerment.entity.TrainingCourse;
import com.womenempowerment.exception.TrainingCourseNotFoundException;
import com.womenempowerment.service.ITrainingCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainingCourse")
public class TrainingCourseController {
    @Autowired
    ITrainingCourseService service;

    @PostMapping("/add")
    public ResponseEntity<String> addCourse(@RequestBody ITrainingCourseDto course) {
        service.addTrainingCourse(course);
        return new ResponseEntity<String>("Course added", HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateCourse(@RequestBody ITrainingCourseDto course) {
        TrainingCourse c = service.updateTrainingCourse(course);
        if (c == null)
            throw new TrainingCourseNotFoundException();
        return new ResponseEntity<String>("Course updated!", HttpStatus.OK);
    }

    @GetMapping("/viewById/{id}")
    public ResponseEntity<String> getCourseById(@PathVariable int id) {
        TrainingCourse course = service.viewTrainingCourse(id);
        if (course == null)
            throw new TrainingCourseNotFoundException();
        return new ResponseEntity<String>(course.toString(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getAllCourses() {
        List<TrainingCourse> courses = service.viewAllTrainingCourse();
        return new ResponseEntity<String>(courses.toString(), HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable int id) {
        TrainingCourse course = service.viewTrainingCourse(id);
        if (course == null)
            throw new TrainingCourseNotFoundException();
        service.deleteTrainingCourse(id);
        return new ResponseEntity<String>("Course deleted", HttpStatus.OK);
    }

    @GetMapping("/viewByName/{name}")
    public ResponseEntity<String> courseByName(@PathVariable String name) {
        List<TrainingCourse> course = service.viewByTrainingCourseName(name);
        if (course.size() == 0)
            throw new TrainingCourseNotFoundException();
        return new ResponseEntity<String>(course.toString(), HttpStatus.OK);
    }
}

package com.womenempowerment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.entity.TrainingCourse;

@Service
public class ITrainingCourseServiceImpl implements ITrainingCourseService{

    @Autowired
    ITrainingCourseDao dao;

    @Override
    public TrainingCourse addTrainingCourse(TrainingCourse course) {
        return dao.save(course);
    }

    @Override
    public TrainingCourse updateTrainingCourse(TrainingCourse course) {
        return null;
    }

    @Override
    public TrainingCourse viewTrainingCourse(int courseId) {
        return null;
    }

    @Override
    public List<TrainingCourse> viewAllTrainingCourse() {
        return null;
    }

    @Override
    public void deleteTrainingCourse(int courseId) {

    }

    @Override
    public void viewByTrainingCourseName(String courseName) {

    }
}

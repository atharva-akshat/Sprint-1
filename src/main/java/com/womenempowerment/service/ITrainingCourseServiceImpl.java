package com.womenempowerment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.womenempowerment.dao.ISchemeDao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.dto.ITrainingCourseDto;
import com.womenempowerment.entity.Scheme;
import com.womenempowerment.entity.TrainingCourse;

@Service
public class ITrainingCourseServiceImpl implements ITrainingCourseService{

    @Autowired
    ITrainingCourseDao courseDao;
    
    @Autowired
    ISchemeDao schemeDao;

    //adding courses
    @Override
    public TrainingCourse addTrainingCourse(ITrainingCourseDto dto) {
    	Scheme scheme= schemeDao.findById(dto.getSchemeId()).orElse(null);
    	System.out.println(scheme.getSchemeId()+" "+ scheme.getSchemeName());
    	TrainingCourse course= new TrainingCourse();
    	course.setTrainingCourseId(dto.getTrainingCourseId());
    	course.setCourseName(dto.getCourseName());
    	course.setCourseDuration(dto.getCourseDuration());
    	course.setStartingDate(dto.getStartingDate());
    	course.setEndingDate(dto.getEndingDate());
    	course.setCourseCompletionStatus(dto.getCourseCompletionStatus());
    	course.setScheme(scheme);
        return courseDao.save(course);
    }

    @Override
    public TrainingCourse updateTrainingCourse(TrainingCourse course) {
        return null;
    }

    @Override
    public TrainingCourse viewTrainingCourse(int courseId) {
        return courseDao.findById(courseId).orElse(null);
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

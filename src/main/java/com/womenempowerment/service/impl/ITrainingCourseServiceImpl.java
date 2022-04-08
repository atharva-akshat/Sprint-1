package com.womenempowerment.service.impl;

import com.womenempowerment.dao.ISchemeDao;
import com.womenempowerment.dao.ITraineeDao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.dto.IAddTraineeTrainingCourseDto;
import com.womenempowerment.dto.ITrainingCourseDto;
import com.womenempowerment.entity.Scheme;
import com.womenempowerment.entity.Trainee;
import com.womenempowerment.entity.TrainingCourse;
import com.womenempowerment.service.ITrainingCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ITrainingCourseServiceImpl implements ITrainingCourseService {

    @Autowired
    ITrainingCourseDao courseDao;

    @Autowired
    ISchemeDao schemeDao;

    @Autowired
    ITraineeDao traineeDao;

    @Override
    public TrainingCourse addTrainingCourse(ITrainingCourseDto dto) {
        Scheme scheme = schemeDao.findById(dto.getSchemeId()).orElse(null);
        TrainingCourse course = new TrainingCourse();
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
    public TrainingCourse updateTrainingCourse(ITrainingCourseDto course) {
        TrainingCourse existingCourse = courseDao.findById(course.getTrainingCourseId()).orElse(null);
        if (existingCourse == null)
            return null;
        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setCourseDuration(course.getCourseDuration());
        existingCourse.setCourseCompletionStatus(course.getCourseCompletionStatus());
        existingCourse.setStartingDate(course.getStartingDate());
        existingCourse.setEndingDate(course.getEndingDate());
        return courseDao.save(existingCourse);
    }

    @Override
    public TrainingCourse viewTrainingCourse(int courseId) {
        return courseDao.findById(courseId).orElse(null);
    }

    @Override
    public List<TrainingCourse> viewAllTrainingCourse() {
        return courseDao.findAll();
    }

    @Override
    public void deleteTrainingCourse(int courseId) {
        courseDao.deleteById(courseId);
    }

    @Override
    public List<TrainingCourse> viewByTrainingCourseName(String courseName) {
        return courseDao.viewbyCourseName(courseName);
    }

    @Override
    public TrainingCourse addTrainee(IAddTraineeTrainingCourseDto trainee) {
        int id = trainee.getTrainingCourseId();
        List<Integer> listTrainee = trainee.getTraineeId();
        TrainingCourse c = courseDao.findById(id).orElse(null);
        List<Trainee> newListTrainee = new ArrayList<>();
        if (c == null)
            return null;
        for (int i : listTrainee) {
            Trainee t = traineeDao.findById(i).orElse(null);
            newListTrainee.add(t);
        }
        c.setTrainee(newListTrainee);
        return courseDao.save(c);
    }

}

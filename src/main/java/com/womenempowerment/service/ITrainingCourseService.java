package com.womenempowerment.service;

import com.womenempowerment.dto.IAddTraineeTrainingCourseDto;
import com.womenempowerment.dto.ITrainingCourseDto;
import com.womenempowerment.entity.TrainingCourse;

import java.util.List;

public interface ITrainingCourseService {
    TrainingCourse addTrainingCourse(ITrainingCourseDto course);

    TrainingCourse updateTrainingCourse(ITrainingCourseDto course);

    TrainingCourse viewTrainingCourse(int courseId);

    List<TrainingCourse> viewAllTrainingCourse();

    void deleteTrainingCourse(int courseId);

    List<TrainingCourse> viewByTrainingCourseName(String courseName);

    TrainingCourse addTrainee(IAddTraineeTrainingCourseDto trainee);
}

package com.womenempowerment.service;

import java.util.List;

import com.womenempowerment.dto.ITrainingCourseDto;
import com.womenempowerment.entity.TrainingCourse;

public interface ITrainingCourseService  {
	TrainingCourse addTrainingCourse(ITrainingCourseDto course);

	TrainingCourse updateTrainingCourse(TrainingCourse course);

	TrainingCourse viewTrainingCourse(int courseId);

	List<TrainingCourse> viewAllTrainingCourse();

	void deleteTrainingCourse(int courseId);

	void viewByTrainingCourseName(String courseName);

}

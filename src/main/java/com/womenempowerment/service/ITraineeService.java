package com.womenempowerment.service;

import java.util.List;

import com.womenempowerment.dto.ITraineeDto;
import com.womenempowerment.entity.Trainee;

public interface ITraineeService  {
	Trainee addTrainee(ITraineeDto course);

	Trainee updateTrainee(Trainee course);

	Trainee viewTrainee(int courseId);

	List<Trainee> viewAllTrainee();

	void deleteTrainee(int courseId);

	List<Trainee> viewAllTraineesByLocation(String location);

	Trainee viewTraineeByAadhar(long aadharNo);

}

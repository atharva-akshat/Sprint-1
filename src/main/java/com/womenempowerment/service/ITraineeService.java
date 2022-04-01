package com.womenempowerment.service;

import com.womenempowerment.dto.ITraineeDto;
import com.womenempowerment.entity.Trainee;

import java.util.List;

public interface ITraineeService {
    Trainee addTrainee(ITraineeDto trainee);

    Trainee updateTrainee(ITraineeDto trainee);

    Trainee viewTrainee(int traineeId);

    List<Trainee> viewAllTrainee();

    void deleteTrainee(int traineeId);

    List<Trainee> viewAllTraineesByLocation(String location);

    Trainee viewTraineeByAadhar(long aadharNo);

}

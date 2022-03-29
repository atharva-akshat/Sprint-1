package com.womenempowerment.service;

import com.womenempowerment.dao.ITraineeDao;
import com.womenempowerment.entity.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ITraineeServiceImpl implements ITraineeService{
    @Autowired
    ITraineeDao dao;
    @Override
    public Trainee addTrainee(Trainee course) {
        return dao.save(course);
    }

    @Override
    public Trainee updateTrainee(Trainee course) {
        return null;
    }

    @Override
    public Trainee viewTrainee(int courseId) {
        return null;
    }

    @Override
    public List<Trainee> viewAllTrainee() {
        return null;
    }

    @Override
    public void deleteTrainee(int courseId) {

    }

    @Override
    public List<Trainee> viewAllTraineesByLocation(String location) {
        return null;
    }

    @Override
    public Trainee viewTraineeByAadhar(long aadharNo) {
        return null;
    }
}

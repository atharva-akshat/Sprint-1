package com.womenempowerment.service;

import com.womenempowerment.dao.IFeedBackDao;
import com.womenempowerment.dao.ITraineeDao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.dto.ITraineeDto;
import com.womenempowerment.entity.FeedBack;
import com.womenempowerment.entity.Trainee;
import com.womenempowerment.entity.TrainingCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ITraineeServiceImpl implements ITraineeService{
    @Autowired
    ITraineeDao dao;
    
    @Override
    public Trainee addTrainee(ITraineeDto trainee) {
    	Trainee t= new Trainee();
    	t.setAadharNo(trainee.getAadharNo());
    	t.setContact(trainee.getContact());
    	t.setDob(trainee.getDob());
    	t.setEmail(trainee.getEmail());
    	t.setFamilyInfo(trainee.getFamilyInfo());
    	t.setTraineeId(trainee.getTraineeId());
    	t.setUserName(trainee.getUserName());
    	t.setPassword(trainee.getPassword());
    	t.setFirstName(trainee.getFirstName());
    	t.setLastName(trainee.getLastName());
        return dao.save(t);
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

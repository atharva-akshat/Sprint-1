package com.womenempowerment.service.impl;

import com.womenempowerment.dao.IFeedBackDao;
import com.womenempowerment.dao.ITraineeDao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.dao.IUserDao;
import com.womenempowerment.dto.ITraineeDto;
import com.womenempowerment.entity.Trainee;
import com.womenempowerment.entity.User;
import com.womenempowerment.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ITraineeServiceImpl implements ITraineeService {
    @Autowired
    ITraineeDao dao;

    @Autowired
    ITrainingCourseDao trainingDao;

    @Autowired
    IFeedBackDao feedbackDao;

    @Autowired
    IUserDao userDao;

    @Override
    public Trainee addTrainee(ITraineeDto traineeDto) {
        User user = userDao.findById(traineeDto.getTraineeId()).orElse(null);
        if (user == null)
            return null;
        Trainee trainee = new Trainee();
        trainee.setTraineeId(user.getLoginId());
        trainee.setUserName(user.getUserName());
        trainee.setPassword(user.getUserPassword());
        trainee.setAadharNo(traineeDto.getAadharNo());
        trainee.setContact(traineeDto.getContact());
        trainee.setDob(traineeDto.getDob());
        trainee.setEmail(traineeDto.getEmail());
        trainee.setFamilyInfo(traineeDto.getFamilyInfo());
        trainee.setFirstName(traineeDto.getFirstName());
        trainee.setLastName(traineeDto.getLastName());
        trainee.setLocation(traineeDto.getLocation());
        trainee.setUser(user);
        return dao.save(trainee);
    }

    @Override
    public Trainee updateTrainee(ITraineeDto traineeDto) {
        Trainee existingTrainee = dao.findById(traineeDto.getTraineeId()).orElse(null);
        if (existingTrainee == null)
            return null;
        existingTrainee.setAadharNo(traineeDto.getAadharNo());
        existingTrainee.setContact(traineeDto.getContact());
        existingTrainee.setDob(traineeDto.getDob());
        existingTrainee.setEmail(traineeDto.getEmail());
        existingTrainee.setFamilyInfo(traineeDto.getFamilyInfo());
        existingTrainee.setFirstName(traineeDto.getFirstName());
        existingTrainee.setLastName(traineeDto.getLastName());
        existingTrainee.setLocation(traineeDto.getLocation());
        return dao.save(existingTrainee);
    }


    @Override
    public Trainee viewTrainee(int traineeId) {
        return dao.findById(traineeId).orElse(null);
    }

    @Override
    public List<Trainee> viewAllTrainee() {
        return dao.findAll();
    }

    @Override
    public void deleteTrainee(int traineeId) {
        dao.deleteById(traineeId);
    }

    @Override
    public List<Trainee> viewAllTraineesByLocation(String location) {
        return dao.findByLocation(location);
    }

    @Override
    public Trainee viewTraineeByAadhar(long aadharNo) {
        return dao.findByAadharNo(aadharNo);
    }
}

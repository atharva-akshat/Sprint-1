package com.womenempowerment.service.impl;

import com.womenempowerment.dao.IFeedBackDao;
import com.womenempowerment.dao.ISchemeDao;
import com.womenempowerment.dao.ITraineeDao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.entity.FeedBack;
import com.womenempowerment.entity.Scheme;
import com.womenempowerment.entity.Trainee;
import com.womenempowerment.entity.TrainingCourse;
import com.womenempowerment.service.IFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFeedBackServiceImpl implements IFeedBackService {

    @Autowired
    IFeedBackDao feedbackDao;

    @Autowired
    ITrainingCourseDao courseDao;

    @Autowired
    ISchemeDao schemeDao;

    @Autowired
    ITraineeDao traineeDao;

    @Override
    public FeedBack addFeedBack(IFeedBackDto dto) {
        TrainingCourse trainingCourse = courseDao.findById(dto.getTrainingCourseId()).orElse(null);
        if(trainingCourse == null)
        	return null;
        Scheme scheme = schemeDao.findSchemeId(trainingCourse.getTrainingCourseId());
        if(scheme == null)
        	return null;
        Trainee trainee = traineeDao.findById(dto.getTraineeId()).orElse(null);
        if(trainee == null)
        	return null;
        FeedBack feedBack = new FeedBack();
        feedBack.setFeedBackId(dto.getFeedBackId());
        feedBack.setSchemeRating(dto.getSchemeRating());
        feedBack.setSchemeTrainingRating(dto.getSchemeTrainingRating());
        feedBack.setOverallRating(dto.getOverallRating());
        feedBack.setComments(dto.getComments());
        feedBack.setFeedbackdate(dto.getFeedbackDate());
        feedBack.setTrainee(trainee);
        feedBack.setScheme(scheme);
        feedBack.setTrainingCourse(trainingCourse);
        return feedbackDao.save(feedBack);
    }

    @Override
    public FeedBack updateFeedBack(IFeedBackDto feedback) {
        FeedBack existingFeedBack = feedbackDao.findById(feedback.getFeedBackId()).orElse(null);
        if (existingFeedBack == null)
            return null;
        existingFeedBack.setSchemeRating(feedback.getSchemeRating());
        existingFeedBack.setSchemeTrainingRating(feedback.getSchemeTrainingRating());
        existingFeedBack.setOverallRating(feedback.getOverallRating());
        existingFeedBack.setComments(feedback.getComments());
        existingFeedBack.setFeedbackdate(feedback.getFeedbackDate());
        return feedbackDao.save(existingFeedBack);
    }

    @Override
    public FeedBack viewFeedBack(int feedbackId) {
        return feedbackDao.findById(feedbackId).orElse(null);
    }

    @Override
    public List<FeedBack> viewAllFeedBack() {
        return feedbackDao.findAll();
    }

    @Override
    public List<FeedBack> viewFeedBackBySchemeName(String schemeName) {
        return feedbackDao.viewBySchemeName(schemeName);
    }

    @Override
    public List<FeedBack> viewFeedBackByTrainingCourseName(String trainingCourseName) {
        return feedbackDao.viewByTrainingCourseName(trainingCourseName);
    }
}

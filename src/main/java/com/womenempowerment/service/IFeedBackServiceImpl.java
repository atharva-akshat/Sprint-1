package com.womenempowerment.service;

import java.util.List;
import com.womenempowerment.dao.*;
import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.entity.*;
import com.womenempowerment.exception.FeedBackNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IFeedBackServiceImpl implements IFeedBackService{

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
		Scheme scheme= schemeDao.findSchemeId(trainingCourse.getTrainingCourseId());
		System.out.println(scheme);
		Trainee trainee = traineeDao.findById(dto.getUserId()).orElse(null);
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
		FeedBack existingFeedBack = feedbackDao.findById(feedback.getFeedBackId()).get();
		if (existingFeedBack==null)
			throw new FeedBackNotFoundException();
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

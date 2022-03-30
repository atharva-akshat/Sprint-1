package com.womenempowerment.service;

import java.util.List;
import com.womenempowerment.dao.*;
import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IFeedBackServiceImpl implements IFeedBackService{

	private static final int Iterable = 0;

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
		Scheme scheme= schemeDao.findById(dto.getSchemeId()).orElse(null);
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
	public FeedBack updateFeedBack(FeedBack feedback) {
		return feedbackDao.save(feedback);
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
		List<FeedBack> feedback=feedbackDao.viewbySchemeName(schemeName);
		return feedback;
	}

	@Override
	public List<FeedBack> viewFeedBackByTrainingCourseName(String trainingCourseName) {
		List<FeedBack> feedback=feedbackDao.viewbytrainingCourseName(trainingCourseName);
		// TODO Auto-generated method stub
		return feedback;
	}

}

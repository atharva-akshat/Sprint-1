package com.womenempowerment.service;

import java.util.List;
import com.womenempowerment.dao.*;
import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.dto.IFeedBackUpdateDto;
import com.womenempowerment.entity.*;
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
	public IFeedBackUpdateDto updateFeedBack(IFeedBackUpdateDto feedback) {
			if (feedbackDao.existsById(feedback.getFeedBackId())){
				FeedBack existingFeedBack = feedbackDao.findById(feedback.getFeedBackId()).get();
				existingFeedBack.setFeedBackId(feedback.getFeedBackId());
				existingFeedBack.setSchemeRating(feedback.getSchemeRating());
				existingFeedBack.setSchemeTrainingRating(feedback.getSchemeTrainingRating());
				existingFeedBack.setOverallRating(feedback.getOverallRating());
				existingFeedBack.setComments(feedback.getComments());
				existingFeedBack.setFeedbackdate(feedback.getFeedbackdate());
				FeedBack updatedFeedBack = feedbackDao.save(existingFeedBack);
				return new IFeedBackUpdateDto(updatedFeedBack.getFeedBackId(),updatedFeedBack.getSchemeRating(),
						updatedFeedBack.getSchemeTrainingRating(),updatedFeedBack.getOverallRating(),
						updatedFeedBack.getComments(), updatedFeedBack.getFeedbackdate());
			}
			else
				return null;
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

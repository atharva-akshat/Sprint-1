package com.womenempowerment.service;

import java.util.List;

import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.dto.IFeedBackUpdateDto;
import com.womenempowerment.entity.FeedBack;

public interface IFeedBackService {
	FeedBack addFeedBack(IFeedBackDto feedBackDto);

	IFeedBackUpdateDto updateFeedBack(IFeedBackUpdateDto feedBack);

	FeedBack viewFeedBack(int feedbackId);

	List<FeedBack> viewAllFeedBack();

	List<FeedBack> viewFeedBackBySchemeName(String schemeName);

	List<FeedBack> viewFeedBackByTrainingCourseName(String trainingCourseName);

}

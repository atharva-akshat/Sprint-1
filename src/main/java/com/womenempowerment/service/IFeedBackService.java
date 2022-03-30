package com.womenempowerment.service;

import java.util.List;

import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.entity.FeedBack;

public interface IFeedBackService {
	FeedBack addFeedBack(IFeedBackDto feedBackDto);

	FeedBack updateFeedBack(FeedBack feedback);

	FeedBack viewFeedBack(int feedbackId);

	List<FeedBack> viewAllFeedBack();

	List<FeedBack> viewFeedBackBySchemeName();

	List<FeedBack> viewFeedBackByTrainingCourseName();
}

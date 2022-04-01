package com.womenempowerment.service;

import com.womenempowerment.dto.IFeedBackDto;
import com.womenempowerment.entity.FeedBack;

import java.util.List;

public interface IFeedBackService {
    FeedBack addFeedBack(IFeedBackDto feedBackDto);

    FeedBack updateFeedBack(IFeedBackDto feedBack);

    FeedBack viewFeedBack(int feedbackId);

    List<FeedBack> viewAllFeedBack();

    List<FeedBack> viewFeedBackBySchemeName(String schemeName);

    List<FeedBack> viewFeedBackByTrainingCourseName(String trainingCourseName);

}

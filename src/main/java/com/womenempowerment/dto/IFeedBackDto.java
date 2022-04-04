package com.womenempowerment.dto;

import java.time.LocalDate;

public class IFeedBackDto {
    private int feedBackId;
    private int schemeRating;
    private int schemeTrainingRating;
    private int overallRating;
    private String comments;
    private LocalDate feedbackDate;
    private int trainingCourseId;
    private int userId;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(int feedBackId) {
        this.feedBackId = feedBackId;
    }

    public int getSchemeRating() {
        return schemeRating;
    }

    public void setSchemeRating(int schemeRating) {
        this.schemeRating = schemeRating;
    }

    public int getSchemeTrainingRating() {
        return schemeTrainingRating;
    }

    public void setSchemeTrainingRating(int schemeTrainingRating) {
        this.schemeTrainingRating = schemeTrainingRating;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDate getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(LocalDate feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public int getTrainingCourseId() {
        return trainingCourseId;
    }

    public void setTrainingCourseId(int trainingCourseId) {
        this.trainingCourseId = trainingCourseId;
    }

}


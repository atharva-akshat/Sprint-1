package com.womenempowerment.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class IFeedBackUpdateDto implements Serializable {
    private final int feedBackId;
    private final int schemeRating;
    private final int schemeTrainingRating;
    private final int overallRating;
    private final String comments;
    private final LocalDate feedbackdate;

    public IFeedBackUpdateDto(int feedBackId, int schemeRating, int schemeTrainingRating,
                              int overallRating, String comments, LocalDate feedbackdate) {
        this.feedBackId = feedBackId;
        this.schemeRating = schemeRating;
        this.schemeTrainingRating = schemeTrainingRating;
        this.overallRating = overallRating;
        this.comments = comments;
        this.feedbackdate = feedbackdate;
    }

    public int getFeedBackId() {
        return feedBackId;
    }

    public int getSchemeRating() {
        return schemeRating;
    }

    public int getSchemeTrainingRating() {
        return schemeTrainingRating;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public String getComments() {
        return comments;
    }

    public LocalDate getFeedbackdate() {
        return feedbackdate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "feedBackId = " + feedBackId + ", " +
                "schemeRating = " + schemeRating + ", " +
                "schemeTrainingRating = " + schemeTrainingRating + ", " +
                "overallRating = " + overallRating + ", " +
                "comments = " + comments + ", " +
                "feedbackdate = " + feedbackdate + ")";
    }
}

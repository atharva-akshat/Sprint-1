package com.womenempowerment.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedBack {
	@SequenceGenerator(name="feedbacknoseq", sequenceName="feedback_seq", allocationSize=2)
	@Id
	@GeneratedValue(generator="feedbacknoseq")
	private int feedBackId;
	@Column(name="schemeRating",length=2)
	private int schemeRating;
	@Column(name="schemeTrainingRating",length=2)
	private int schemeTrainingRating;
	@Column(name="overallRating",length=2)
	private int overallRating;
	@Column(name="comments",length=20)
	private String comments;
	@Column(name="feedbackdate")
	private	LocalDate feedbackdate;
	
	//@ManyToOne
	//@JoinColumn(name="loginId")
	private User user;
	
	//@ManyToOne
	//@JoinColumn(name="trainingCourseId")
	private TrainingCourse training;
	
	//@ManyToOne
	//@JoinColumn(name="schemeId")
	private Scheme scheme;

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

	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}

	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TrainingCourse getTraining() {
		return training;
	}

	public void setTraining(TrainingCourse training) {
		this.training = training;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}
	
	
}

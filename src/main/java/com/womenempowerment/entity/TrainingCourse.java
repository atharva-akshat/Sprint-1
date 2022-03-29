package com.womenempowerment.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="trainingcourse")
public class TrainingCourse {
	@Id
	@Column(length = 4)
	private Integer trainingCourseId;
	@Column(length = 20)
	private String	courseName;
	@Column(length = 10)
	private String courseDuration;
	@Column
	private LocalDate	startingDate;
	@Column
	private LocalDate	endingDate;
	@Column(length = 10)
	private String	courseCompletionStatus;

	@ManyToOne
	private Scheme scheme;
	@ManyToMany
	private List<Trainee> trainee;
	
	//Getters and setters
	public Integer getTrainingCourseId() {
		return trainingCourseId;
	}
	public void setTrainingCourseId(Integer trainingCourseId) {
		this.trainingCourseId = trainingCourseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public LocalDate getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public LocalDate getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}
	public String getCourseCompletionStatus() {
		return courseCompletionStatus;
	}
	public void setCourseCompletionStatus(String courseCompletionStatus) {
		this.courseCompletionStatus = courseCompletionStatus;	}
	public Scheme getScheme() {		return scheme;	}
	public void setScheme(Scheme scheme) {		this.scheme = scheme;	}

	public List<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}
}


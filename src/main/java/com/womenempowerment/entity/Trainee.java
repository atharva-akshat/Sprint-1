package com.womenempowerment.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "trainee")
public class Trainee {

	@Id
	private Integer traineeId;
	@Column(length = 25)
	private String userName;
	@Column(length = 20)
	private String password;
	@Column(length = 50)
	private String firstName;
	@Column(length = 50)
	private String lastName;
	@Column
	private long contact;
	@Column(length = 50)
	private String email;
	@Column(length = 100)
	private String familyInfo;
	@Column(length = 12)
	private long aadharNo;
	@Column
	private LocalDate dob;
	@OneToMany
	@JoinColumn(name="trainingCourseId")
	private List<TrainingCourse> trainingCourse;
	/*@OneToMany
	@JoinColumn(name="feedBackId")
	private List<FeedBack> feedBack;*/

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFamilyInfo() {
		return familyInfo;
	}

	public void setFamilyInfo(String familyInfo) {
		this.familyInfo = familyInfo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public List<TrainingCourse> getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(List<TrainingCourse> trainingCourse) {
		this.trainingCourse = trainingCourse;
	}

	/*public List<FeedBack> getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(List<FeedBack> feedBack) {
		this.feedBack = feedBack;
	}*/
}
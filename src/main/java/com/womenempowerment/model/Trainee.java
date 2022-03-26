package com.womenempowerment.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Trainee {

	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 5, allocationSize = 100)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGen")
	private Integer traineeId;
	@Column(length = 25)
	private String userName;
	@Column
	private String password;
	@Column(length = 50)
	private String firstName;
	@Column(length = 50)
	private String lastName;
	@Column
	private long contact;
	@Column(length = 50)
	private String email;
	@Column
	private String familyInfo;
	@Column(length = 12)
	private long aadharNo;
	@Column
	private LocalDate dob;

	//private TrainingCourse trainingCourse;

	//private ArrayList<List> feedBack;

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

/*	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}*/
}

package com.womenempowerment.entity;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "NGO")
public class NGO {

	@Id
	private Integer ngoId;
	@Column(length=25)
	private String ngoName;
	@Column(length=25)
	private String ngoLocation;
	@Column(length=25)
	private String ngoType;
	@Column(length=100)
	private String ngoMotive;
	private double donation;
	private int ngoSize;
	@Column(length=100)
	private String ngoActivities;

	@ManyToOne
	@JoinColumn(name="trainingCourseId")
	private TrainingCourse trainingCourse;

	public Integer getNgoId() {
		return ngoId;
	}

	public void setNgoId(Integer ngoId) {
		this.ngoId = ngoId;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getNgoLocation() {
		return ngoLocation;
	}

	public void setNgoLocation(String ngoLocation) {
		this.ngoLocation = ngoLocation;
	}

	public String getNgoType() {
		return ngoType;
	}

	public void setNgoType(String ngoType) {
		this.ngoType = ngoType;
	}

	public String getNgoMotive() {
		return ngoMotive;
	}

	public void setNgoMotive(String ngoMotive) {
		this.ngoMotive = ngoMotive;
	}

	public double getDonation() {
		return donation;
	}

	public void setDonation(double donation) {
		this.donation = donation;
	}

	public int getNgoSize() {
		return ngoSize;
	}

	public void setNgoSize(int ngoSize) {
		this.ngoSize = ngoSize;
	}

	public String getNgoActivities() {
		return ngoActivities;
	}

	public void setNgoActivities(String ngoActivities) {
		this.ngoActivities = ngoActivities;
	}

	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}
}
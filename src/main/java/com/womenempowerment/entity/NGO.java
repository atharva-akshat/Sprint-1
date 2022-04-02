package com.womenempowerment.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "NGO")
public class NGO {

	@Id
	@Column(name="ngoId", length=4)
	private Integer ngoId;
	@Column(name="ngoName",length=25)
	private String ngoName;
	@Column(name="ngoLocation",length=25)
	private String ngoLocation;
	@Column(name="ngoType",length=25)
	private String ngoType;
	@Column(name="ngoMotive",length=100)
	private String ngoMotive;
	@Column
	private double donation;
	@Column(name="ngoSize",length=3)
	private int ngoSize;
	@Column(name="ngoActivities", length=100)
	private String ngoActivities;

	@ManyToMany
	@JoinTable(name= "ngo_training", joinColumns = @JoinColumn(name ="ngoId"),
	inverseJoinColumns = @JoinColumn(name ="Id"))
	private List<TrainingCourse> trainingCourse;

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

	public List<TrainingCourse> getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(List<TrainingCourse> trainingCourse) {
		this.trainingCourse = trainingCourse;
	}

	@Override
	public String toString() {
		return "NGO{" +
				"ngoId=" + ngoId +
				", ngoName='" + ngoName + '\'' +
				", ngoLocation='" + ngoLocation + '\'' +
				", ngoType='" + ngoType + '\'' +
				", ngoMotive='" + ngoMotive + '\'' +
				", donation=" + donation +
				", ngoSize=" + ngoSize +
				", ngoActivities='" + ngoActivities + '\'' +
				", trainingCourse=" + this.extractNgoId() +
				'}';
	}
	
	public List<Integer> extractNgoId(){
		List<Integer> ngoId= new ArrayList<Integer>();
		for(int i=0;i<trainingCourse.size();i++) {
			ngoId.add(trainingCourse.get(i).getTrainingCourseId());
		}
		return ngoId;
	}
}
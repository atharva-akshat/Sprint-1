package com.womenempowerment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
//import javax.persistence.UniqueConstraint;

//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "TBL_NGO")
public class NGO {

	@Id
	@GeneratedValue
	private int id;
	private int size;
	@Column(length=35)
	private String name;

	@Column(length=25)
	private String location;
	@Column(length=25)
	private String organizationType;
	@Column(length=25)
	private Double donation;
	@Column(length=25)
	private String activities;
	@Column(length=25)
	private String motive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	public NGO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLoaction(String location) {
		this.location = location;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public Double getDonation() {
		return donation;
	}

	public void setContactNo(Double donation) {
		this.donation = donation;
	}

	public String getMotive() {
		return motive;
	}

	public void setMotive(String motive) {
		this.motive = motive;
	}

	public String getActivities() {
		return activities;
	}

	public void activities(String activities) {
		this.activities = activities;
	}

}
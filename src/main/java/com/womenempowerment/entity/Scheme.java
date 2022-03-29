package com.womenempowerment.entity;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="scheme")
public class Scheme {
	@Id
	@Column(name= "id", length = 4)
	private Integer schemeId;
	@Column(name="schemename", length = 25)
	private String schemeName;
	@Column(name="type", length=25)
	private String schemeType;
	@Column(name="launchdate")
	private LocalDate schemeLaunchDate;
	@Column(name="eligibility")
	private String schemeEligibility;
	@Column(name="objective")
	private String schemeObjective;

	@ManyToOne
	@JoinColumn(name="trainingCourseId")
	private TrainingCourse training;

	public Integer getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(Integer schemeId) {
		this.schemeId = schemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeType() {
		return schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public LocalDate getSchemeLaunchDate() {
		return schemeLaunchDate;
	}

	public void setSchemeLaunchDate(LocalDate schemeLaunchDate) {
		this.schemeLaunchDate = schemeLaunchDate;
	}

	public String getSchemeEligibility() {
		return schemeEligibility;
	}

	public void setSchemeEligibility(String schemeEligibility) {
		this.schemeEligibility = schemeEligibility;
	}

	public String getSchemeObjective() {
		return schemeObjective;
	}

	public void setSchemeObjective(String schemeObjective) {
		this.schemeObjective = schemeObjective;
	}

	public TrainingCourse getTraining() {
		return training;
	}

	public void setTraining(TrainingCourse training) {
		this.training = training;
	}
}


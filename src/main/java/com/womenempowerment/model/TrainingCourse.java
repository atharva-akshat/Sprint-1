package com.womenempowerment.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}


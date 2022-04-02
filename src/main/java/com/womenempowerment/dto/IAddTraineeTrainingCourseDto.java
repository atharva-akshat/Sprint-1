package com.womenempowerment.dto;

import java.util.List;

public class IAddTraineeTrainingCourseDto {
	private int trainingCourseId;
	private List<Integer> userId;
	public int getTrainingCourseId() {
		return trainingCourseId;
	}
	public void setTrainingCourseId(int trainingCourseId) {
		this.trainingCourseId = trainingCourseId;
	}
	public List<Integer> getUserId() {
		return userId;
	}
	public void setUserId(List<Integer> userId) {
		this.userId = userId;
	}
	
	
}

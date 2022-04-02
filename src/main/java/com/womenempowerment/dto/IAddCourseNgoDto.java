package com.womenempowerment.dto;

import java.util.List;

public class IAddCourseNgoDto {
	private int ngoId;
	private List<Integer> courseId;
	public int getNgoId() {
		return ngoId;
	}
	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}
	public List<Integer> getCourseId() {
		return courseId;
	}
	public void setCourseId(List<Integer> courseId) {
		this.courseId = courseId;
	}
	
	
}

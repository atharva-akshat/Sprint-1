package com.womenempowerment.dto;

import java.util.List;

public class IAddTraineeTrainingCourseDto {
    private int trainingCourseId;
    private List<Integer> traineeId;

    public int getTrainingCourseId() {
        return trainingCourseId;
    }

    public void setTrainingCourseId(int trainingCourseId) {
        this.trainingCourseId = trainingCourseId;
    }

    public List<Integer> getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(List<Integer> traineeId) {
        this.traineeId = traineeId;
    }


}

package com.womenempowerment.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainingcourse")
public class TrainingCourse {
    @Id
    @Column(name = "trainingCourseId", length = 4)
    private Integer trainingCourseId;
    @Column(name = "courseName", length = 20)
    private String courseName;
    @Column(name = "courseDuration", length = 10)
    private String courseDuration;
    @Column(name = "startingDate")
    private LocalDate startingDate;
    @Column(name = "endingDate")
    private LocalDate endingDate;
    @Column(name = "courseCompletionStatus", length = 10)
    private String courseCompletionStatus;

    @ManyToOne
    @JoinColumn(name = "schemeId")
    private Scheme scheme;

    @ManyToMany
    @JoinTable(name = "trainee_training", joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "traineeId"))
    private List<Trainee> trainee;

    @ManyToMany(mappedBy = "trainingCourse")
    private List<NGO> ngo;


    @OneToMany(mappedBy = "trainingCourse", cascade = CascadeType.ALL)
    private List<FeedBack> feedBacks;

    public Integer getTrainingCourseId() {
        return trainingCourseId;
    }

    public void setTrainingCourseId(Integer trainingCourseId) {
        this.trainingCourseId = trainingCourseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public String getCourseCompletionStatus() {
        return courseCompletionStatus;
    }

    public void setCourseCompletionStatus(String courseCompletionStatus) {
        this.courseCompletionStatus = courseCompletionStatus;
    }

    public Scheme getScheme() {
        return scheme;
    }

    public void setScheme(Scheme scheme) {
        this.scheme = scheme;
    }

    public List<Trainee> getTrainee() {
        return trainee;
    }

    public void setTrainee(List<Trainee> trainee) {
        this.trainee = trainee;
    }

    public List<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    public void setFeedBacks(List<FeedBack> feedBacks) {
        this.feedBacks = feedBacks;
    }

    public List<NGO> getNgo() {
        return ngo;
    }

    public void setNgo(List<NGO> ngo) {
        this.ngo = ngo;
    }

    @Override
    public String toString() {
        List<Integer> s = this.extractTraineeId();
        return "TrainingCourse [trainingCourseId=" + trainingCourseId + ", courseName=" + courseName
                + ", courseDuration=" + courseDuration + ", startingDate=" + startingDate + ", endingDate=" + endingDate
                + ", courseCompletionStatus=" + courseCompletionStatus + ", scheme=" + scheme.getSchemeId() + ", trainee=" + s + "]";
    }

    public List<Integer> extractTraineeId() {
        List<Integer> listId = new ArrayList<>();
        for (Trainee value : trainee) {
            listId.add(value.getTraineeId());
        }
        return listId;
    }


}


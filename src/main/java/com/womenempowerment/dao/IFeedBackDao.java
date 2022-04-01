package com.womenempowerment.dao;

import com.womenempowerment.entity.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IFeedBackDao extends JpaRepository<FeedBack, Integer> {

    @Query("select f from FeedBack f where f.scheme.schemeName like ?1")
    List<FeedBack> viewBySchemeName(String name);

    @Query("select f from FeedBack f where f.trainingCourse.courseName like ?1")
    List<FeedBack> viewByTrainingCourseName(String courseName);
}

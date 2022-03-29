package com.womenempowerment.dao;


import com.womenempowerment.entity.TrainingCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainingCourseDao extends JpaRepository<TrainingCourse, Integer> {

}

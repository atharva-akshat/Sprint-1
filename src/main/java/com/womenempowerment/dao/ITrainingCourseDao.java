package com.womenempowerment.dao;


import com.womenempowerment.entity.TrainingCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITrainingCourseDao extends JpaRepository<TrainingCourse, Integer> {
    @Query(value = "SELECT * FROM trainingcourse tc WHERE tc.course_name like %?1%",
            nativeQuery = true)
    List<TrainingCourse> viewbyCourseName(String name);

}

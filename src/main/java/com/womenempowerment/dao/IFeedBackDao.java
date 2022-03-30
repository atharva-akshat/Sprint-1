package com.womenempowerment.dao;


import com.womenempowerment.entity.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFeedBackDao extends JpaRepository<FeedBack, Integer>{
    @Query(value = "SELECT * FROM feedback,scheme WHERE scheme.schemename like %?1%",
            nativeQuery = true)
    public List<FeedBack> findBySchemeName(String name);

    @Query(value = "SELECT * FROM feedback,trainingcourse WHERE trainingcourse.courseName like %?1%",
            nativeQuery = true)
    public List<FeedBack> findByCourseName(String name);


}

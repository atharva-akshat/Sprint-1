package com.womenempowerment.dao;

import com.womenempowerment.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ITraineeDao extends JpaRepository<Trainee, Integer> {
    @Query("select t from Trainee t where t.aadharNo = ?1")
    Trainee findByAadharNo(long aadharNo);

    @Query("select t from Trainee t where t.location = ?1")
    List<Trainee> findByLocation(String location);


}

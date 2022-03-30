package com.womenempowerment.dao;

import com.womenempowerment.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITraineeDao extends JpaRepository<Trainee, Integer> {

}

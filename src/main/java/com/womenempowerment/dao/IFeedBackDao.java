package com.womenempowerment.dao;


import com.womenempowerment.entity.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedBackDao extends JpaRepository<FeedBack, Integer>{

}

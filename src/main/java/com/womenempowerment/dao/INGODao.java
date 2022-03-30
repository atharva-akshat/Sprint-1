package com.womenempowerment.dao;

import com.womenempowerment.entity.NGO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INGODao extends JpaRepository<NGO, Integer>{

}

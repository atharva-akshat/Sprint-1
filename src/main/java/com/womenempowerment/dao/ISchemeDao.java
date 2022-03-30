package com.womenempowerment.dao;

import com.womenempowerment.entity.Scheme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISchemeDao extends JpaRepository<Scheme, Integer>{

}

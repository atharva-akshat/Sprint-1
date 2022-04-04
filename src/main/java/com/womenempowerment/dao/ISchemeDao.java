package com.womenempowerment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.womenempowerment.entity.Scheme;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ISchemeDao extends JpaRepository<Scheme, Integer>{
	@Query("select s from Scheme s where s.schemeType like %?1%")
	List<Scheme> findByType(String schemeType);
	
	@Query("select s from Scheme s where s.schemeLaunchDate = ?1")
	List<Scheme> findByLaunchDate(LocalDate date);
}

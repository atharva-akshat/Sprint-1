package com.womenempowerment.service;

import java.time.LocalDate;
import java.util.List;

import com.womenempowerment.dao.ISchemeDao;
import com.womenempowerment.entity.Scheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ISchemeServiceImpl implements ISchemeService{
	@Autowired
	ISchemeDao dao;
	@Override
	public Scheme addScheme(Scheme scheme) {
		return dao.save(scheme);
	}

	@Override
	public Scheme updateScheme(Scheme scheme) {
		return null;
	}

	@Override
	public Scheme viewScheme(int schemeId) {
		return null;
	}

	@Override
	public List<Scheme> viewAllScheme(){
		return null;
	}

	@Override
	public void deleteScheme(int schemeId) {
		
	}

	@Override
	public List<Scheme> viewSchemesByType(String schemeType){
		return null;
	}

	@Override
	public List<Scheme> viewSchemeByLaunchDate(LocalDate date){
		return null;
	}
}

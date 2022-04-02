package com.womenempowerment.service;

import java.time.LocalDate;
import java.util.List;

import com.womenempowerment.dao.IFeedBackDao;
import com.womenempowerment.dao.ISchemeDao;
import com.womenempowerment.dto.ISchemeDto;
import com.womenempowerment.entity.Scheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ISchemeServiceImpl implements ISchemeService{
	@Autowired
	ISchemeDao dao;
	
	@Autowired 
	IFeedBackDao feedbackdao;
	
	@Override
	public Scheme addScheme(ISchemeDto scheme) {
		Scheme sc= new Scheme();
		sc.setSchemeId(scheme.getSchemeId());
		sc.setSchemeName(scheme.getSchemeName());
		sc.setSchemeObjective(scheme.getSchemeObjective());
		sc.setSchemeEligibility(scheme.getSchemeEligibility());
		sc.setSchemeLaunchDate(scheme.getSchemeLaunchDate());
		sc.setSchemeType(scheme.getSchemeType());
		return dao.save(sc);
	}

	@Override
	public Scheme updateScheme(ISchemeDto scheme) {
		Scheme existingscheme= dao.findById(scheme.getSchemeId()).orElse(null);
		if(existingscheme==null)
			return null;
		existingscheme.setSchemeName(scheme.getSchemeName());
		existingscheme.setSchemeObjective(scheme.getSchemeObjective());
		existingscheme.setSchemeEligibility(scheme.getSchemeEligibility());
		existingscheme.setSchemeLaunchDate(scheme.getSchemeLaunchDate());
		existingscheme.setSchemeType(scheme.getSchemeEligibility());
		
		return dao.save(existingscheme);
	}

	@Override
	public Scheme viewScheme(int schemeId) {
		return dao.findById(schemeId).orElse(null);
	}

	@Override
	public List<Scheme> viewAllScheme(){
		return dao.findAll();
	}

	@Override
	public void deleteScheme(int schemeId) {
		dao.deleteById(schemeId);
	}

	@Override
	public List<Scheme> viewSchemesByType(String schemeType){
		return dao.findByType(schemeType);
	}

	@Override
	public List<Scheme> viewSchemeByLaunchDate(LocalDate date){
		return dao.findByLaunchDate(date);
	}
}

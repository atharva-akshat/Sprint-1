package com.womenempowerment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.womenempowerment.dao.INGODao;
import com.womenempowerment.dto.INgoDto;
import com.womenempowerment.entity.NGO;

@Service
public class INGOServiceImpl implements INGOService {
	
	@Autowired
	INGODao dao;

	@Override
	public NGO addNGO(INgoDto dto) {
		NGO ngo= new NGO();
		ngo.setNgoId(dto.getNgoId());
		ngo.setNgoName(dto.getNgoName());
		ngo.setNgoActivities(dto.getNgoActivities());
		ngo.setDonation(dto.getDonation());
		ngo.setNgoType(dto.getNgoType());
		ngo.setNgoMotive(dto.getNgoMotive());
		ngo.setNgoLocation(dto.getNgoLocation());
		ngo.setNgoSize(dto.getNgoSize());
		return dao.save(ngo);
	}

	@Override
	public NGO updateNGO(NGO ngo) {
		// TODO Auto-generated method stub
		if(dao.existsById(ngo.getNgoId())) {
			dao.deleteById(ngo.getNgoId());
			dao.save(ngo);
		}
		return null;
	}

	@Override
	public NGO viewNGO(int ngoId) {
		// TODO Auto-generated method stub
		return dao.findById(ngoId).orElse(null);
	}

	@Override
	public List<NGO> viewAllNGO() {
		// TODO Auto-generated method stub
		return dao.findAll();
		//return null;
	}

	@Override
	public void deleteNGO(int ngoId) {
		// TODO Auto-generated method stub
		dao.deleteById(ngoId);
		
	}

	@Override
	public List<NGO> viewNGOByMotive(String motive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NGO> viewNGOByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

}

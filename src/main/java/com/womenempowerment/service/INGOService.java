package com.womenempowerment.service;

import java.util.List;

import com.womenempowerment.dto.INgoDto;

import com.womenempowerment.entity.NGO;

public interface INGOService  {
	
	NGO addNGO(INgoDto ngo);

	NGO updateNGO(INgoDto ngo);

	NGO viewNGO(int ngoId);

	List<NGO> viewAllNGO();

	void deleteNGO(int ngoId);

	List<NGO> viewNGOByMotive(String motive);

	List<NGO> viewNGOByLocation(String location);
}

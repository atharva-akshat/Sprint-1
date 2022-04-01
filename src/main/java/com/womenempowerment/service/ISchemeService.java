package com.womenempowerment.service;

import java.time.LocalDate;
import java.util.List;

import com.womenempowerment.dto.ISchemeDto;
import com.womenempowerment.entity.Scheme;

public interface ISchemeService  {
	Scheme addScheme(ISchemeDto scheme);

	Scheme updateScheme(Scheme scheme);

	Scheme viewScheme(int schemeId);

	List<Scheme> viewAllScheme();

	void deleteScheme(int schemeId);

	List<Scheme> viewSchemesByType(String schemeType);

	List<Scheme> viewSchemeByLaunchDate(LocalDate date);
}

package com.womenempowerment.service;

import com.womenempowerment.dto.ISchemeDto;
import com.womenempowerment.entity.Scheme;

import java.time.LocalDate;
import java.util.List;

public interface ISchemeService {
    Scheme addScheme(ISchemeDto scheme);

    Scheme updateScheme(ISchemeDto scheme);

    Scheme viewScheme(int schemeId);

    List<Scheme> viewAllScheme();

    void deleteScheme(int schemeId);

    List<Scheme> viewSchemesByType(String schemeType);

    List<Scheme> viewSchemeByLaunchDate(LocalDate date);
}

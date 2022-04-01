package com.womenempowerment.service;

import com.womenempowerment.dto.INgoDto;
import com.womenempowerment.entity.NGO;

import java.util.List;

public interface INGOService {

    NGO addNGO(INgoDto ngo);

    NGO updateNGO(INgoDto ngo);

    NGO viewNGO(int ngoId);

    List<NGO> viewAllNGO();

    void deleteNGO(int ngoId);

    List<NGO> viewNGOByMotive(String motive);

    List<NGO> viewNGOByLocation(String location);
}

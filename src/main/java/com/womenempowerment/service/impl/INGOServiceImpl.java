package com.womenempowerment.service.impl;

import com.womenempowerment.dao.INGODao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.dto.IAddCourseNgoDto;
import com.womenempowerment.dto.INgoDto;
import com.womenempowerment.entity.NGO;
import com.womenempowerment.entity.TrainingCourse;
import com.womenempowerment.service.INGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class INGOServiceImpl implements INGOService {

    @Autowired
    INGODao dao;

    @Autowired
    ITrainingCourseDao trainingDao;

    @Override
    public NGO addNGO(INgoDto dto) {
        NGO ngo = new NGO();
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
    public NGO updateNGO(INgoDto ngo) {
        NGO existingNgo = dao.findById(ngo.getNgoId()).orElse(null);
        if (existingNgo == null)
            return null;
        existingNgo.setNgoName(ngo.getNgoName());
        existingNgo.setNgoActivities(ngo.getNgoActivities());
        existingNgo.setDonation(ngo.getDonation());
        existingNgo.setNgoType(ngo.getNgoType());
        existingNgo.setNgoMotive(ngo.getNgoMotive());
        existingNgo.setNgoLocation(ngo.getNgoLocation());
        existingNgo.setNgoSize(ngo.getNgoSize());
        return dao.save(existingNgo);
    }

    @Override
    public NGO viewNGO(int ngoId) {
        return dao.findById(ngoId).orElse(null);
    }

    @Override
    public List<NGO> viewAllNGO() {
        return dao.findAll();
    }

    @Override
    public void deleteNGO(int ngoId) {
        dao.deleteById(ngoId);

    }

    @Override
    public List<NGO> viewNGOByMotive(String motive) {
        return dao.findByNgoMotive(motive);
    }

    @Override
    public List<NGO> viewNGOByLocation(String location) {
        return dao.findByNgoLocation(location);
    }

    @Override
    public NGO addCourse(IAddCourseNgoDto dto) {
        NGO ngo = dao.findById(dto.getNgoId()).orElse(null);
        if (ngo == null)
            return null;
        List<Integer> courseList = dto.getCourseId();
        List<TrainingCourse> newCourseList = new ArrayList<>();

        for (int i : courseList) {
            TrainingCourse c = trainingDao.findById(i).orElse(null);
            if (c == null)
                return null;
            newCourseList.add(c);
        }
        ngo.setTrainingCourse(newCourseList);
        return dao.save(ngo);

    }

}

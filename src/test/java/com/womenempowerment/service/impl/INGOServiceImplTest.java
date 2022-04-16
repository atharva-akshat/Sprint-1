package com.womenempowerment.service.impl;

import com.womenempowerment.dao.INGODao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.entity.NGO;
import com.womenempowerment.entity.TrainingCourse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class INGOServiceImplTest {

    @Autowired
    INGODao dao;

    @Autowired
    ITrainingCourseDao trainingDao;

    @BeforeEach
    void setUp() {
        System.out.println("NGO Test Started");
    }

    @AfterEach
    void tearDown() {
        System.out.println("NGO Test Ended");
    }

    @Test
    void addNGO() {
        NGO ngo = new NGO();
        ngo.setNgoId(999);
        ngo.setNgoName("test");
        ngo.setNgoActivities("test");
        ngo.setDonation(999);
        ngo.setNgoType("test");
        ngo.setNgoMotive("test");
        ngo.setNgoLocation("test");
        ngo.setNgoSize(999);
        dao.save(ngo);
        assertNotNull(dao.findById(999));
    }

    @Test
    void updateNGO() {
        NGO existingNgo = dao.findById(999).orElse(null);
        if (existingNgo == null)
            assertNull(existingNgo);
        existingNgo.setNgoName("testing");
        existingNgo.setNgoActivities("testing");
        existingNgo.setDonation(888);
        existingNgo.setNgoType("testing");
        existingNgo.setNgoMotive("testing");
        existingNgo.setNgoLocation("testing");
        existingNgo.setNgoSize(888);
        dao.save(existingNgo);
        assertEquals(888, dao.findById(999).get().getDonation());
    }

    @Test
    void viewNGO() {
        assertNotNull(dao.findById(999));
    }

    @Test
    void viewAllNGO() {
        assertNotNull(dao.findAll());
    }

    @Test
    void viewNGOByMotive() {
        assertNotNull(dao.findByNgoMotive("Help everyone"));
    }

    @Test
    void viewNGOByLocation() {
        assertNotNull(dao.findByNgoLocation("Gir"));
    }

    @Test
    void addCourse() {
        NGO existingNgo = dao.findById(999).get();
        List<TrainingCourse> testList = new ArrayList<>();
        testList.add(trainingDao.findById(301).orElse(null));
        testList.add(trainingDao.findById(302).orElse(null));
        existingNgo.setTrainingCourse(testList);
        assertNotNull(existingNgo.getTrainingCourse());
    }

    @Test
    void deleteNGO() {
        dao.deleteById(999);
        assertNull(dao.findById(999).orElse(null));
    }
}
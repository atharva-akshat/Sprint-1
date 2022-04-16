package com.womenempowerment.service.impl;

import com.womenempowerment.dao.IFeedBackDao;
import com.womenempowerment.dao.ISchemeDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ISchemeServiceImplTest {

    @Autowired
    ISchemeDao dao;

    @Autowired
    IFeedBackDao feedbackdao;

    @BeforeEach
    void setUp() {
        System.out.println("Scheme Test Started");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Scheme Test Ended");
    }

    @Test
    void addScheme() {
    }

    @Test
    void updateScheme() {
    }

    @Test
    void viewScheme() {
    }

    @Test
    void viewAllScheme() {
    }

    @Test
    void deleteScheme() {
    }

    @Test
    void viewSchemesByType() {
    }

    @Test
    void viewSchemeByLaunchDate() {
    }
}
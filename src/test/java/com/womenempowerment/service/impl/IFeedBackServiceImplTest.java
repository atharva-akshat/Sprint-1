package com.womenempowerment.service.impl;

import com.womenempowerment.dao.IFeedBackDao;
import com.womenempowerment.dao.ISchemeDao;
import com.womenempowerment.dao.ITraineeDao;
import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.entity.FeedBack;
import com.womenempowerment.exception.FeedBackAlreadyExistsException;
import com.womenempowerment.exception.FeedBackNotFoundException;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IFeedBackServiceImplTest {

    @Autowired
    IFeedBackDao feedbackDao;

    @Autowired
    ITrainingCourseDao courseDao;

    @Autowired
    ISchemeDao schemeDao;

    @Autowired
    ITraineeDao traineeDao;

    @BeforeEach
    void setUp() {
        System.out.println("Feedback Test Started");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Feedback Test Ended");
    }

    @Test
    @Order(1)
    void addFeedBack() {
        FeedBack feedBack = new FeedBack();
        feedBack.setFeedBackId(99);
        feedBack.setSchemeRating(9);
        feedBack.setSchemeTrainingRating(9);
        feedBack.setOverallRating(9);
        feedBack.setComments("testAdd");
        feedbackDao.save(feedBack);
        assertNotNull(feedbackDao.findById(99));
    }

    @Test
    @Order(2)
    void addFeedBackExists() {
        assertThrows(FeedBackAlreadyExistsException.class, () -> {
            if (feedbackDao.findById(99).orElse(null) != null)
                throw new FeedBackAlreadyExistsException();
        });
    }

    @Test
    @Order(3)
    void updateFeedBack() {
        FeedBack feedBack = feedbackDao.findById(99).orElse(null);
        feedBack.setSchemeRating(8);
        feedBack.setSchemeTrainingRating(8);
        feedBack.setOverallRating(8);
        feedBack.setComments("testUpdate");
        feedbackDao.save(feedBack);
        assertEquals(8, feedbackDao.findById(99).get().getSchemeRating());
    }

    @Test
    @Order(4)
    void updateFeedBackNotFound() {
        assertThrows(FeedBackNotFoundException.class, () -> {
            FeedBack feedBack = feedbackDao.findById(12345).orElse(null);
            if (feedBack == null)
                throw new FeedBackNotFoundException();
        });
    }

    @Test
    @Order(8)
    void viewFeedBack() {
        assertNotNull(feedbackDao.findById(99));
    }

    @Test
    @Order(5)
    void viewAllFeedBack() {
        assertNotNull(feedbackDao.findAll());
    }

    @Test
    @Order(6)
    void viewFeedBackBySchemeName() {
        assertNotNull(feedbackDao.viewBySchemeName("STEP"));
    }

    @Test
    @Order(7)
    void viewFeedBackByTrainingCourseName() {
        assertNotNull(feedbackDao.viewByTrainingCourseName("Email Writing"));
    }
}
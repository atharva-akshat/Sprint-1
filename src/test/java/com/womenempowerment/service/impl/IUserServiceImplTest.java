package com.womenempowerment.service.impl;

import com.womenempowerment.dao.IUserDao;
import com.womenempowerment.entity.User;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IUserServiceImplTest {

    @Autowired
    IUserDao dao;

    @BeforeEach
    void setUp() {
        System.out.println("User Test Started");
    }

    @AfterEach
    void tearDown() {
        System.out.println("User Test Ended");
    }

    @Test
    @Order(1)
    void registerUser_validDetails() {
        User user = new User();
        user.setUserName("test");
        user.setUserPassword("Test123!");
        assertNotNull(dao.save(user));
    }

    @Test
    @Order(2)
    void login_ValidDetails() {
        assertNotNull(dao.authenticateUser("test", "Test123!"));
    }

    @Test
    @Order(3)
    void forgotPassword_validDetails() {
        User existingUser = dao.authenticateUser("test", "Test123!");
        existingUser.setUserPassword("TEst123!");
        assertNotNull(dao.save(existingUser));
    }
}
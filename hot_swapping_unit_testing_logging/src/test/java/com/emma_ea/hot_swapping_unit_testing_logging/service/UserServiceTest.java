package com.emma_ea.hot_swapping_unit_testing_logging.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testGetUser() {
        assertEquals("Tom", userService.getUser());
    }
}
package com.emma_ea.hot_swapping_unit_testing_logging.service;

import com.emma_ea.hot_swapping_unit_testing_logging.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }

}

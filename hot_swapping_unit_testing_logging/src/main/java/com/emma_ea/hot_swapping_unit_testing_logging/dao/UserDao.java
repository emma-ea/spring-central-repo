package com.emma_ea.hot_swapping_unit_testing_logging.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public String getUser() {
        return "Tom";
    }

}

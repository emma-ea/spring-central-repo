package com.emma_ea.hot_swapping_unit_testing_logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("log")
    @ResponseBody
    public Map<String, Object> triggerLog() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", "stephen");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
        return result;
    }

}

package com.emma_ea.websockets_and_stomp.config;

import com.emma_ea.websockets_and_stomp.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class UserSchedulerConfig {

    @Autowired
    SimpMessagingTemplate template;

//    @Scheduled(fixedDelay = 5000)
//    public void scheduleMessage() {
//        template.convertAndSend("/topic/user", new UserResponse("scheduler"));
//    }

}

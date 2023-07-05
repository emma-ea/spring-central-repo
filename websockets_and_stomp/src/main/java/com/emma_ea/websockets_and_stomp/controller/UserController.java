package com.emma_ea.websockets_and_stomp.controller;

import com.emma_ea.websockets_and_stomp.model.User;
import com.emma_ea.websockets_and_stomp.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {
        return new UserResponse("Hello, " + user.getName());
    }

}

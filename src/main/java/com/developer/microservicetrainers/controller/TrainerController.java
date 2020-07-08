package com.developer.microservicetrainers.controller;

import com.developer.microservicetrainers.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {
    @Autowired
    private UserClient userClient;
}

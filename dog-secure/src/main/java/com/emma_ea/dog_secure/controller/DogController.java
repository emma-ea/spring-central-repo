package com.emma_ea.dog_secure.controller;

import com.emma_ea.dog_secure.entity.Dog;
import com.emma_ea.dog_secure.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogController {

    private final DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Dog> all() {
        return service.allDogs();
    }
}

package com.emma_ea.dog_secure.service;

import com.emma_ea.dog_secure.entity.Dog;
import com.emma_ea.dog_secure.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private DogRepository repository;

    public DogService(DogRepository repository) {
        this.repository = repository;
    }

    public List<Dog> allDogs() {
       return (List<Dog>) repository.findAll();
    }
}

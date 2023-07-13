package com.emma_ea.dog_graphql.service;

import com.emma_ea.dog_graphql.entity.Dog;
import com.emma_ea.dog_graphql.repository.DogRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DogServiceImplTest {

    @Resource
    DogRepository repository;

    @Resource
    DogService dogService;

    @BeforeEach
    void setup() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Rani", "Akita", "Japan"));
        dogs.add(new Dog("Inu", "Shiba Inu", "Japan"));
        repository.saveAll(dogs);
    }

    @AfterEach
    void tearDown() {
        repository.deleteAll();
    }

    @Test
    void retrieveAll() {
        List<Dog> exp = dogService.retrieveAll();
        List<Dog> actual = ((List<Dog>)repository.findAll());
        assertEquals(exp.size(), actual.size());
        assertEquals(exp.get(0).getName(), actual.get(0).getName());
    }

    @Test
    void retrieveById() {
        Dog act = repository.findAll().iterator().next();
        Optional<Dog> exp = dogService.retrieveById(act.getId());
        assertEquals(exp.get().getId(), act.getId());
        assertEquals(exp.get().getName(), act.getName());
    }

    @Test
    void retrieveAllBreeds() {
        List<String> exp = dogService.retrieveAllBreeds();
        List<String> act = repository.retrieveBreeds();
        assertEquals(exp.size(), act.size());
        assertEquals(exp.get(0), act.get(0));
    }
}
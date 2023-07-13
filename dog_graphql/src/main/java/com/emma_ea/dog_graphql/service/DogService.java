package com.emma_ea.dog_graphql.service;

import com.emma_ea.dog_graphql.entity.Dog;

import java.util.List;
import java.util.Optional;

public interface DogService {

    List<Dog> retrieveAll();

    Optional<Dog> retrieveById(long id);

    List<String> retrieveAllBreeds();

}

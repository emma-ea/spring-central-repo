package com.emma_ea.dogdata.service;

import com.emma_ea.dogdata.entity.Dog;

import java.util.List;
import java.util.Optional;

public interface DogService {

    List<Dog> retrieveAll();

    List<Dog> retrieveByBreed(String breed);

    List<String> retrieveAllBreeds();

    List<String> retrieveAllNames();

    Optional<Dog> retrieveById(Long id);

    List<Dog> retrieveByName(String name);

}

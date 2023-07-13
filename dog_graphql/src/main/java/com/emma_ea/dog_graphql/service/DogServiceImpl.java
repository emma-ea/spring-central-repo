package com.emma_ea.dog_graphql.service;

import com.emma_ea.dog_graphql.entity.Dog;
import com.emma_ea.dog_graphql.repository.DogRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {

    private final DogRepository repository;

    public DogServiceImpl(DogRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Dog> retrieveAll() {
        return (List<Dog>) repository.findAll();
    }

    @Override
    public Optional<Dog> retrieveById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<String> retrieveAllBreeds() {
        return repository.retrieveBreeds();
    }
}

package com.emma_ea.dogdata.service;

import com.emma_ea.dogdata.entity.Dog;
import com.emma_ea.dogdata.repository.DogRepository;
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
    public List<Dog> retrieveByBreed(String breed) {
        return repository.findByBreed(breed);
    }

    @Override
    public List<String> retrieveAllBreeds() {
        return repository.retrieveAllBreeds();
    }

    @Override
    public List<String> retrieveAllNames() {
        return repository.retrieveAllNames();
    }

    @Override
    public Optional<Dog> retrieveById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Dog> retrieveByName(String name) {
        return repository.findByName(name);
    }

}

package com.emma_ea.dog_graphql.controller;

import com.emma_ea.dog_graphql.entity.Dog;
import com.emma_ea.dog_graphql.exception.BreedNotFoundException;
import com.emma_ea.dog_graphql.exception.FindDogBreedException;
import com.emma_ea.dog_graphql.repository.DogRepository;
import com.emma_ea.dog_graphql.service.DogService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class DogController {

    private final DogService service;
    private final DogRepository repository;

    public DogController(DogService service, DogRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @QueryMapping
    public List<Dog> findDogBreeds() {
        return this.service.retrieveAll();
    }

    @QueryMapping
    public String findDogBreedById(@Argument long id) {
        Optional<Dog> dog = service.retrieveById(id);
        if (dog.isPresent()) {
            return dog.get().getBreed();
        }
        throw new FindDogBreedException("No dog found with id", id);
    }

    @QueryMapping
    public List<String> findAllDogNames() {
        return repository.retrieveNames();
    }

    @MutationMapping
    public Boolean deleteDogBreed(@Argument String breed) {
        List<Dog> dogList = (List<Dog>) repository.findAll();
        boolean deleted = false;
        for (Dog d : dogList) {
            if (d.getBreed().equals(breed)) {
                repository.delete(d);
                deleted = true;
            }
        }
        if (!deleted)
            throw new BreedNotFoundException("Could not delete dog. No matching breed found", breed);
        return deleted;
    }

    @MutationMapping
    public Dog updateDogName(@Argument String newName,@Argument Long id) {
        Optional<Dog> dog = repository.findById(id);
        if (dog.isPresent()) {
            Dog newDog = dog.get();
            newDog.setName(newName);
            repository.save(newDog);
            return newDog;
        }
        throw new FindDogBreedException("Could not update dog. No matching id.", id);
    }

}


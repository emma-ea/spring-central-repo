package com.emma_ea.dog_graphql.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.emma_ea.dog_graphql.entity.Dog;
import com.emma_ea.dog_graphql.exception.FindDogBreedException;
import com.emma_ea.dog_graphql.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final DogRepository repository;

    public Mutation(DogRepository repository) {
        this.repository = repository;
    }

    Boolean deleteDogBreed(String breed) {
        return repository.deleteByBreed(breed);
    }

    Dog updateDogName(String newName, Long id) {
        Optional<Dog> dog = repository.findById(id);
        if (dog.isPresent()) {
            Dog newDog = dog.get();
            newDog.setName(newName);
            repository.save(newDog);
            return newDog;
        }
        throw new FindDogBreedException("Could not find and update dog with id specified.", id);
    }
}

package com.emma_ea.dog_graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.emma_ea.dog_graphql.entity.Dog;
import com.emma_ea.dog_graphql.exception.FindDogBreedException;
import com.emma_ea.dog_graphql.repository.DogRepository;
import com.emma_ea.dog_graphql.service.DogService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private final DogRepository repository;

    public Query(DogRepository repository) {
        this.repository = repository;
    }

    List<Dog> findDogBreeds() {
        return (List<Dog>) repository.findAll();
    }

    String findDogBreedById(long id) {
        Optional<Dog> dog = repository.findById(id);
        if (dog.isPresent()) {
            return dog.get().getBreed();
        }
        throw new FindDogBreedException("No dog found with id", id);
    }

    List<String> findAllDogNames() {
        return repository.retrieveNames();
    }

}

//package com.emma_ea.dog_graphql.resolver.query;
//
//import com.emma_ea.dog_graphql.entity.Dog;
//import com.emma_ea.dog_graphql.exception.FindDogBreedException;
//import com.emma_ea.dog_graphql.repository.DogRepository;
//import com.emma_ea.dog_graphql.service.DogService;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class DogQueryResolver implements GraphQLQueryResolver {
//
//    private final DogRepository repository;
//
//    public DogQueryResolver(DogRepository repository) {
//        this.repository = repository;
//    }
//
//    public List<Dog> findDogBreeds() {
//        return (List<Dog>) repository.findAll();
//    }
//
//    public String findDogBreedById(long id) {
//        Optional<Dog> dog = repository.findById(id);
//        if (dog.isPresent()) {
//            return dog.get().getBreed();
//        }
//        throw new FindDogBreedException("No dog found with id", id);
//    }
//
//    public List<String> findAllDogNames() {
//        return repository.retrieveNames();
//    }
//
//}

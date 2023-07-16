//package com.emma_ea.dog_graphql.resolver.mutation;
//
//import com.emma_ea.dog_graphql.entity.Dog;
//import com.emma_ea.dog_graphql.exception.BreedNotFoundException;
//import com.emma_ea.dog_graphql.exception.FindDogBreedException;
//import com.emma_ea.dog_graphql.repository.DogRepository;
//import graphql.kickstart.tools.GraphQLMutationResolver;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class DogMutation implements GraphQLMutationResolver {
//
//    private final DogRepository repository;
//
//    public DogMutation(DogRepository repository) {
//        this.repository = repository;
//    }
//
//    public Boolean deleteDogBreed(String breed) {
//        List<Dog> dogList = (List<Dog>) repository.findAll();
//        boolean deleted = false;
//        for (Dog d : dogList) {
//            if (d.getBreed().equals(breed)) {
//                repository.delete(d);
//                deleted = true;
//            }
//        }
//        if (!deleted)
//            throw new BreedNotFoundException("Could not delete dog. No matching breed found", breed);
//        return deleted;
//    }
//
//    public Dog updateDogName(String newName, Long id) {
//        Optional<Dog> dog = repository.findById(id);
//        if (dog.isPresent()) {
//            Dog newDog = dog.get();
//            newDog.setName(newName);
//            repository.save(newDog);
//            return newDog;
//        }
//        throw new FindDogBreedException("Could not update dog. No matching id.", id);
//    }
//}

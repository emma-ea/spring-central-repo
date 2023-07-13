package com.emma_ea.dog_graphql.repository;

import com.emma_ea.dog_graphql.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("SELECT d.breed FROM Dog d")
    List<String> retrieveBreeds();

}

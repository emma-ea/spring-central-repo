package com.emma_ea.dogdata.repository;

import com.emma_ea.dogdata.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DogRepository extends CrudRepository<Dog, Long> {

    List<Dog> findByName(String name);

    List<Dog> findByBreed(String breed);

    @Query(value = "SELECT d.breed FROM Dog d")
    List<String> retrieveAllBreeds();

    @Query(value = "SELECT d.name FROM Dog d")
    List<String> retrieveAllNames();

}

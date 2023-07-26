package com.emma_ea.dog_secure.repository;

import com.emma_ea.dog_secure.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> { }

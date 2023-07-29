package com.emma_ea.dogdata.web;

import com.emma_ea.dogdata.entity.Dog;
import com.emma_ea.dogdata.exception.DogNotFoundException;
import com.emma_ea.dogdata.service.DogService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/dogs")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Dog info retrieve successfully"),
        @ApiResponse(responseCode = "400", description = "Couldn't find Dog with parameter specified")
})
public class DogController {

    private final DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @GetMapping("all")
    public ResponseEntity<List<Dog>> retrieveAll() {
        List<Dog> dogs = service.retrieveAll();
        return new ResponseEntity<List<Dog>>(dogs, HttpStatus.OK);
    }

    @GetMapping("breeds")
    public ResponseEntity<List<String>> retrieveAllBreeds() {
        List<String> breeds = service.retrieveAllBreeds();
        return new ResponseEntity<List<String>>(breeds, HttpStatus.OK);
    }

    @GetMapping("names")
    public ResponseEntity<List<String>> retrieveAllNames() {
        List<String> names = service.retrieveAllNames();
        return new ResponseEntity<List<String>>(names, HttpStatus.OK);
    }

    @GetMapping("/breed")
    public ResponseEntity<List<Dog>> retrieveDogsByBreed(@RequestParam String breed) {
        List<Dog> dogs = service.retrieveByBreed(breed);
        return new ResponseEntity<List<Dog>>(dogs, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<Dog> retrieveById(@RequestParam Long id) {
        Optional<Dog> dog = service.retrieveById(id);
        return dog.map(d -> new ResponseEntity<>(d, HttpStatus.OK))
                .orElseThrow(DogNotFoundException::new);
//        return dog.map(d -> new ResponseEntity<>(d, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name")
    public ResponseEntity<List<Dog>> retrieveByName(@RequestParam String name) {
        List<Dog> dogs = service.retrieveByName(name);
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }

}

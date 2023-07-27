package com.emma_ea.consuming_soap_and_rest.controller;

import com.emma_ea.consuming_soap_and_rest.model.Joke;
import com.emma_ea.consuming_soap_and_rest.service.JokeService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/joke")
public class JokeController {

    private final String jokeApi = "https://official-joke-api.appspot.com/random_joke";

    private final RestTemplate restTemplate;

    private final JokeService service;

    public JokeController(RestTemplateBuilder builder, JokeService service) {
        this.restTemplate = builder.build();
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Joke> randomJoke() {
       return makeJokeRequest();
//        return service.getRandomJoke();
    }

    private ResponseEntity<Joke> makeJokeRequest() {
        return restTemplate.getForEntity(jokeApi, Joke.class);
    }

}

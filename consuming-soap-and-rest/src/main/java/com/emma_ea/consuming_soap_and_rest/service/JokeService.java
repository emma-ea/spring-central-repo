package com.emma_ea.consuming_soap_and_rest.service;

import com.emma_ea.consuming_soap_and_rest.model.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

//    private final String jokeApi = "https://official-joke-api.appspot.com/random_joke";
//
//    @Autowired
//    RestTemplateBuilder builder;
//
//    public ResponseEntity<Joke> getRandomJoke() {
//       return makeJokeRequest();
//    }
//
//    private ResponseEntity<Joke> makeJokeRequest() {
//        return restTemplate().getForEntity(jokeApi, Joke.class);
//    }
//
//    public RestTemplate restTemplate() {
//        return builder.build();
//    }

}

package com.emma_ea.dogdata.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog with id specified does not exist")
public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException() {}

    public DogNotFoundException(String message) {
        super(message);
    }
}

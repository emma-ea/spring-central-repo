package com.emma_ea.dog_graphql.exception;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreedNotFoundException
        extends RuntimeException implements GraphQLError {

    Map<String, Object> extensions = new HashMap<>();

    public BreedNotFoundException(String msg, String invalidDogBreed) {
        super(String.format("%s: %s\n", msg, invalidDogBreed));
        extensions.put("invalidDogBreed", invalidDogBreed);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return ErrorType.DataFetchingException;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }
}

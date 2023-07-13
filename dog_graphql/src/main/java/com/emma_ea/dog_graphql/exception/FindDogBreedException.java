package com.emma_ea.dog_graphql.exception;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDogBreedException
        extends RuntimeException implements GraphQLError {

    Map<String, Object> extensions = new HashMap<>();

    public FindDogBreedException(String msg, Long dogId) {
        super(String.format("%s %d", msg, dogId));
        extensions.put("unknownDogId", dogId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }
}

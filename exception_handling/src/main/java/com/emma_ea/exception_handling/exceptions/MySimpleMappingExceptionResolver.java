package com.emma_ea.exception_handling.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class MySimpleMappingExceptionResolver {

    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties errorMaps = new Properties();
        errorMaps.put("java.lang.ArithmeticException", "mathError");
        errorMaps.put("java.lang.NullPointerException", "nullPointerError");
        resolver.setExceptionMappings(errorMaps);
        return resolver;
    }

}

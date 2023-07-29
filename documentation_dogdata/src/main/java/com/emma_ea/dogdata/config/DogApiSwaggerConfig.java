package com.emma_ea.dogdata.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
import java.util.Collections;

@Configuration
public class DogApiSwaggerConfig {

    @Bean
    public OpenAPI api() {
       return new OpenAPI()
               .info(new Info().title("Dog Breed API")
                       .description("List of dog breeds, origin, local names given to these breeds. Enjoy!")
                       .contact(new Contact().name("Emmanuel").url("https://github.com/emma-ea"))
                       .version("v0.1")
                       .license(new License().name("apache").url("")));
    }

}

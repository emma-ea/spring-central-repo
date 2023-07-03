package com.emma_ea.form_validation.model;

import jakarta.validation.constraints.NotBlank;

public record User(
        @NotBlank(message = "username cannot be blank")
        String name,
        @NotBlank(message = "password cannot be blank")
        String password,
        Double grade
) {

}

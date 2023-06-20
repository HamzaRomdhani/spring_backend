package com.learn.banking.DTOs;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;

@Getter
@Setter
@Builder
public class UserRequest {


    @NotEmpty(message = "firstname should not be empty")
    @NotNull(message = "firstname should not be null")
    @NotBlank(message = "firstname should not be blank")
    private String firstName;
    @NotEmpty(message = "lastName should not be empty")
    @NotNull(message = "lastName should not be null")
    @NotBlank(message = "lastName should not be blank")
    private String lastName;
    @NotEmpty(message = "email should not be empty")
    @NotNull(message = "email should not be null")
    @NotBlank(message = "email should not be blank")
    @Email(message = "should be a valid email")
    private String email;

    private Boolean active;



}


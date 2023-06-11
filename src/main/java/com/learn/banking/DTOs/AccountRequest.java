package com.learn.banking.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountRequest {


    @NotNull(message = "this iban should not be null")  //Null
    @NotBlank(message = "this iban should not be blank") // ""
    @NotEmpty(message = "this iban should not be empty") // " "
    private String iban;

    @NotNull(message = "this user id  should not be null")
    private Integer userId;
}

package com.learn.banking.DTOs;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    //private boolean active;
    private String iban;

}

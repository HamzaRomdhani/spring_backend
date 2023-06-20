package com.learn.banking.DTOs;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountResponse {



    private Integer id;

    private String iban;

    private String firstName;

    private String lastName;

}

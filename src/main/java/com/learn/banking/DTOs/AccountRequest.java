package com.learn.banking.DTOs;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountRequest {


    private String iban;

    private Integer userId;
}

package com.learn.banking.mappers;

import com.learn.banking.DTOs.AccountRequest;
import com.learn.banking.entity.Account;
import com.learn.banking.entity.User;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {


    public Account toAccount(AccountRequest accountRequest){
        return  Account.builder()
                .iban(accountRequest.getIban())
                .user(User.builder()
                        .id(accountRequest.getUserId())
                        .build())
                .build();
    }



}

package com.learn.banking.service;

import com.learn.banking.DTOs.AccountRequest;
import com.learn.banking.entity.Account;
import com.learn.banking.mappers.AccountMapper;
import com.learn.banking.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository repository;
    private final AccountMapper mapper;

    public Integer saveAccount(AccountRequest accountreq){

        var account = mapper.toAccount(accountreq);

        return repository.save(account).getId();
    }


}

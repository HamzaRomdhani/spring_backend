package com.learn.banking.service;

import com.learn.banking.DTOs.AccountRequest;
import com.learn.banking.DTOs.AccountResponse;
import com.learn.banking.entity.Account;
import com.learn.banking.mappers.AccountMapper;
import com.learn.banking.repository.AccountRepository;
import com.learn.banking.validations.ObjectValidation;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository repository;
    private final AccountMapper mapper;

    private final ObjectValidation<AccountRequest> validator;

    public Integer saveAccount(AccountRequest accountreq){

        validator.validate(accountreq);

        var account = mapper.toAccount(accountreq);

        return repository.save(account).getId();
    }


    public List<AccountResponse> findall(){
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public AccountResponse findbyid(Integer id){

        return repository.findById(id).
                map(mapper::toResponse)
                .orElseThrow(()-> new EntityNotFoundException("no Account find with this id "+id));
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}

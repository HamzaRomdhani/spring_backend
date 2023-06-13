package com.learn.banking.Controller;

import com.learn.banking.DTOs.AccountRequest;
import com.learn.banking.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService service;

    @PostMapping("/createNewAccount")
    public Integer saveAccount(@RequestBody AccountRequest Account){

        return service.saveAccount(Account);
    }
}

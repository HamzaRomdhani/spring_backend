package com.learn.banking.Controller;

import com.learn.banking.DTOs.AccountRequest;
import com.learn.banking.DTOs.AccountResponse;
import com.learn.banking.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService service;

    @PostMapping("/createNewAccount")
    public Integer saveAccount(@RequestBody AccountRequest Account){

        return service.saveAccount(Account);
    }

    @GetMapping("/getAllAccount")
    public List<AccountResponse> getAllAccount(){
        return service.findall();
    }

    @GetMapping("/getAccountById")
    public AccountResponse getAccountbyid(@RequestParam Integer id){
        return service.findbyid(id);
    }
}

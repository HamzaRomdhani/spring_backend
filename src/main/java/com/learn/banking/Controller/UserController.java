package com.learn.banking.Controller;

import com.learn.banking.DTOs.UserRequest;
import com.learn.banking.DTOs.UserResponse;
import com.learn.banking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/saveUser")
    public Integer saveUser(@RequestBody UserRequest userRequest){

        return service.save(userRequest);
    }

    @GetMapping("/allUser")
    public List<UserResponse> findall(){

        return service.findall();
    }

    @GetMapping("/findUser")
    public UserResponse findById(@RequestParam Integer id){
        return service.findbyid(id);

    }

}

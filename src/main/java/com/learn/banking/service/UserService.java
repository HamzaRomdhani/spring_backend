package com.learn.banking.service;

import com.learn.banking.DTOs.AccountRequest;
import com.learn.banking.DTOs.UserRequest;
import com.learn.banking.DTOs.UserResponse;
import com.learn.banking.mappers.UserMapper;
import com.learn.banking.repository.UserRepository;
import com.learn.banking.validations.ObjectValidation;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;
    private final ObjectValidation<UserRequest> validator;


    public Integer save(UserRequest userRequest) {
        validator.validate(userRequest);
        var user = mapper.toUser(userRequest);
        return  repository.save(user).getId();
    }

    @Transactional
    public List<UserResponse> findall(){
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public UserResponse findbyid(Integer id){
      return repository.findById(id).
              map(mapper::toResponse).
              orElseThrow(()-> new EntityNotFoundException("this user does not exist" + id));
    }


}

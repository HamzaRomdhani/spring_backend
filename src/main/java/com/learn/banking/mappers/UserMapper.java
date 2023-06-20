package com.learn.banking.mappers;

import com.learn.banking.DTOs.UserRequest;
import com.learn.banking.DTOs.UserResponse;
import com.learn.banking.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserRequest userRequest){
        return User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .active(userRequest.getActive())
                .build();


    }


    public UserResponse toResponse(User user) {

        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .iban(user.getAccount().getIban())
                .build();

    }
}

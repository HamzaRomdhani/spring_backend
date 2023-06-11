package com.learn.banking.validations;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ObjectValidation<T> {

    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator= factory.getValidator();


    public void validate(T objectToValidate){

       Set<ConstraintViolation<T>> violations = validator.validate(objectToValidate);

       if(!violations.isEmpty()){
           Set<String> erroMsg=violations
                   .stream()
                   .map(ConstraintViolation::getMessage)
                   .collect(Collectors.toSet());
       }

    }

}

package com.learn.banking.handler;

import com.learn.banking.Exceptions.ObjectValidationEception;
import org.hibernate.ObjectDeletedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ObjectValidationEception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponsException handler(ObjectValidationEception exp){
    return ResponsException
            .builder()
            .errormsg("Object not valid")
            .errorSource(exp.getSource())
            .ValidationsErrors(exp.getVoilations())
            .build();

    }
}

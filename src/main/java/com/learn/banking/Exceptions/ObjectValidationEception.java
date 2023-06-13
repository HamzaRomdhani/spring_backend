package com.learn.banking.Exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class ObjectValidationEception extends RuntimeException {


    @Getter
    private final Set<String> voilations;

    @Getter
    private final String source;

}

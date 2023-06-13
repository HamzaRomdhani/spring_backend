package com.learn.banking.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
@Builder
public class ResponsException {


    private String errormsg;

    private String errorSource;

    private Set<String> ValidationsErrors;
}

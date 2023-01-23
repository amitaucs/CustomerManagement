package com.codetechies.customermanagement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerAccountResponse {

    private String customerId;
    private final String msg;
}

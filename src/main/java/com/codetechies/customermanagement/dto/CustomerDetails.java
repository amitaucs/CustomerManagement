package com.codetechies.customermanagement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerDetails {

    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String address;
}

package com.codetechies.customermanagement.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerDetails {

    @Schema(description = "Customer first name")
    private final String firstName;
    @Schema(description = "Customer last name")
    private final String lastName;
    @Schema(description = "Customer phone number")
    private final String phone;
}

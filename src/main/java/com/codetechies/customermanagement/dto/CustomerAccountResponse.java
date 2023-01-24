package com.codetechies.customermanagement.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerAccountResponse {

    @Schema(description = "Customer reference id")
    private String customerId;
    @Schema(description = "Customer message after registration")
    private final String msg;
}

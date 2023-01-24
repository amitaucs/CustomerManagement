package com.codetechies.customermanagement.controller;

import com.codetechies.customermanagement.dto.CustomerAccountResponse;
import com.codetechies.customermanagement.dto.CustomerDetails;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerApi {
    @Operation(summary = "This endpoint will register a new customer and creates a new " +
            "customer records in database")
    @ApiResponses(value = {@ApiResponse(responseCode = "500", description = "Internal server error"),
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "401", description = "Unauthorized access")})
    @PostMapping("/registerNewCustomer")
    ResponseEntity<CustomerAccountResponse> createNewAccount(@RequestBody CustomerDetails customerDetails);
}

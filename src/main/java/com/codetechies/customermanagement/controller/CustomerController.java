package com.codetechies.customermanagement.controller;

import com.codetechies.customermanagement.dto.CustomerAccountResponse;
import com.codetechies.customermanagement.dto.CustomerDetails;
import com.codetechies.customermanagement.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Tag(name = "Customer-Management")
public class CustomerController implements CustomerApi{

    private CustomerService customerService;

    @Override
    public ResponseEntity<CustomerAccountResponse> createNewAccount(CustomerDetails customerDetails) {
        var accountResponse = customerService.saveCustomer(customerDetails);
        return ResponseEntity.status(HttpStatus.OK).body(accountResponse);
    }
}

package com.codetechies.customermanagement.controller;

import com.codetechies.customermanagement.dto.CustomerAccountResponse;
import com.codetechies.customermanagement.dto.CustomerDetails;
import com.codetechies.customermanagement.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping("/createNewCustomerAccount")
    ResponseEntity<CustomerAccountResponse> createNewAccount(@RequestBody CustomerDetails customerDetails) {

        var accountResponse = customerService.saveCustomer(customerDetails);
        return ResponseEntity.status(HttpStatus.OK).body(accountResponse);
    }

}

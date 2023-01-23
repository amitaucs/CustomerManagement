package com.codetechies.customermanagement.service;

import com.codetechies.customermanagement.dto.CustomerAccountResponse;
import com.codetechies.customermanagement.dto.CustomerDetails;
import com.codetechies.customermanagement.entity.Customer;
import com.codetechies.customermanagement.repo.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

   private CustomerRepo customerRepo;

   public CustomerAccountResponse saveCustomer(CustomerDetails customerDetails){
       var customer = new Customer();
       BeanUtils.copyProperties(customerDetails,customer);
       var customerSaved =  customerRepo.save(customer);

       return CustomerAccountResponse.builder().msg("Customer details created successfully")
               .customerId(String.valueOf(customerSaved.getId()))
               .build();

   }
}

package com.codetechies.customermanagement.service;

import com.codetechies.customermanagement.dto.CustomerDetails;
import com.codetechies.customermanagement.entity.Customer;
import com.codetechies.customermanagement.repo.CustomerRepo;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    private CustomerRepo customerRepo;
    @InjectMocks
    private CustomerService customerService;

    @Before("Any Test")
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveCustomer(){
        var customer = new Customer();
        customer.setId(14L);
        Mockito.when(customerRepo.save(any(Customer.class))).thenReturn(customer);

        var expectedValue = customerService
                .saveCustomer(CustomerDetails.builder().firstName("Amit").build());

        verify(customerRepo, times(1)).save(any(Customer.class));
        assertEquals(Long.valueOf(expectedValue.getCustomerId()),14L);

    }

}

package com.codetechies.customermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="T_CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private Long id;
    @Column(name = "FIRST_NAME", nullable = false)
    private  String firstName;
    @Column(name = "LAST_NAME", nullable = false)
    private  String lastName;
    @Column(name = "PHONE", nullable = false)
    private  String phone;

}

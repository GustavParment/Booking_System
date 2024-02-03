package com.gustav.bookingsystem.model.customer;


import lombok.Data;


@Data
public class BillingInformation {
    private String cardNumber;
    private int securityCode;
    private String cardProvider;
}

package com.gustav.bookingsystem.model.customer;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;


@Document(collection = "Customer")
public record Customer(
        @MongoId
        String _id,
        String name,
        String email,
        String gender,
        BillingInformation billingInformation,
        LocalDateTime registrationDate
) {
}
package com.gustav.bookingsystem.model.room;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document (collection = "HotelRoom")
public abstract class HotelRoom {
    @Id
    private ObjectId _id;
    private String type;
    private String price;
    private boolean isAvailable;




}

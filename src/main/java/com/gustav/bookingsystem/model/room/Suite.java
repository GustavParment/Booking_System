package com.gustav.bookingsystem.model.room;


import org.bson.types.ObjectId;

public class Suite extends HotelRoom {
    public Suite(ObjectId _id, String type, String price, boolean isAvailable) {
        super(_id, type, price, isAvailable);
    }
}

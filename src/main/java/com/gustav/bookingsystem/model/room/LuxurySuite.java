package com.gustav.bookingsystem.model.room;

import org.bson.types.ObjectId;

public class LuxurySuite extends HotelRoom {
    public LuxurySuite(ObjectId _id, String type, String price, boolean isAvailable) {
        super(_id, type, price, isAvailable);
    }
}

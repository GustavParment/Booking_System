package com.gustav.bookingsystem.model.room;

import org.bson.types.ObjectId;

public class SingleRoom extends HotelRoom{
    public SingleRoom(ObjectId _id, String type, String price, boolean isAvailable) {
        super(_id, type, price, isAvailable);
    }
}

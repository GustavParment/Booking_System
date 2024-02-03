package com.gustav.bookingsystem.model.room;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRoomRepository
extends MongoRepository<HotelRoom,String> {
}

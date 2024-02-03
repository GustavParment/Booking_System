package com.gustav.bookingsystem.model.room;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HotelController {

    private final HotelRoomService hotelRoomService;

    @Autowired
    public HotelController(HotelRoomService hotelRoomService) {
        this.hotelRoomService = hotelRoomService;
    }

    @PostConstruct
    public void initializeRooms() {

        hotelRoomService.initializeRooms();
    }
}
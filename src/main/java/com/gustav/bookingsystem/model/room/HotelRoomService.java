package com.gustav.bookingsystem.model.room;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class HotelRoomService {

    private final HotelRoomRepository hotelRoomRepository;

    @Autowired
    public HotelRoomService(HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    public void initializeRooms() {
        hotelRoomRepository.save(new SingleRoom(new ObjectId(),"Single Room","400kr/night",true));
        hotelRoomRepository.save(new DoubleRoom(new ObjectId(),"Double Room","1200kr/night",true));
        hotelRoomRepository.save(new Suite(new ObjectId(),"Suite","7000/night",true));
        hotelRoomRepository.save(new LuxurySuite(new ObjectId(),"Luxury Suite","15000kr/night",true));
    }

    public void saveHotelRoom(HotelRoom room) {

        if (room.get_id() == null) {
            room.set_id(new ObjectId());
        }
        hotelRoomRepository.save(room);
    }

}
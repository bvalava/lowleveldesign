package com.striver.lld.hotel.repository;

import com.striver.lld.hotel.domain.Room;

import java.util.List;

public interface RoomRepository {

    Room save(Room room);

    List<Room> findByHotelAndType(String hotelId, String roomTypeId);
}

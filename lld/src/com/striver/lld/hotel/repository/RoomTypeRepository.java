package com.striver.lld.hotel.repository;

import com.striver.lld.hotel.domain.RoomType;

import java.util.List;
import java.util.Optional;

public interface RoomTypeRepository {

    RoomType save(RoomType roomType);

    Optional<RoomType> findById(String roomTypeId);

    List<RoomType> findByHotel(String hotelId);
}

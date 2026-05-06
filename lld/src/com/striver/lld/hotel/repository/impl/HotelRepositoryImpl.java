package com.striver.lld.hotel.repository.impl;

import com.striver.lld.hotel.domain.Hotel;
import com.striver.lld.hotel.repository.HotelRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class HotelRepositoryImpl implements HotelRepository {

    private Map<String, Hotel> hotels = new ConcurrentHashMap<>();

    @Override
    public Hotel save(Hotel hotel) {
        hotels.put(hotel.getId(), hotel);
        return hotel;
    }

    @Override
    public Optional<Hotel> findById(String hotelId) {
        return Optional.ofNullable(hotels.get(hotelId));
    }

    @Override
    public List<Hotel> findByLocation(String city, String country) {
        return hotels.values().stream()
                .filter(hotel -> hotel.getCity().equals(city) && hotel.getCountry().equals(country))
                .filter(Hotel::isActive)
                .collect(Collectors.toList());
    }
}

package com.striver.lld.hotel.service;

import com.striver.lld.hotel.domain.Booking;
import com.striver.lld.hotel.repository.BookingRepository;

import java.util.List;

public class UserService {

    private BookingRepository bookingRepository;

    public UserService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> listUserBookings(String userId) {
        return bookingRepository.findByUser(userId);
    }
}

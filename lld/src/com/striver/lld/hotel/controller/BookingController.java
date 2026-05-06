package com.striver.lld.hotel.controller;

import com.striver.lld.hotel.domain.Booking;
import com.striver.lld.hotel.domain.DateRange;
import com.striver.lld.hotel.service.BookingService;

public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public Booking createBooking(String userId, String hotelId, String roomTypeId, DateRange range,
                                 long expectedTotalPrice) {
        return bookingService.createBooking(userId, hotelId, roomTypeId, range, expectedTotalPrice);
    }

    public void cancelBooking(String bookingId, String userId) {
        bookingService.cancelBooking(bookingId, userId);
    }
}

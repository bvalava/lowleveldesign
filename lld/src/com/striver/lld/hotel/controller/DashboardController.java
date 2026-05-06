package com.striver.lld.hotel.controller;

import com.striver.lld.hotel.domain.Booking;
import com.striver.lld.hotel.service.UserService;

import java.util.List;

public class DashboardController {

    private UserService userService;

    public DashboardController(UserService userService) {
        this.userService = userService;
    }

    public List<Booking> listUserBookings(String userId) {
        return userService.listUserBookings(userId);
    }
}

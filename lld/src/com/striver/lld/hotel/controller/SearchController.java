package com.striver.lld.hotel.controller;

import com.striver.lld.hotel.domain.DateRange;
import com.striver.lld.hotel.domain.Hotel;
import com.striver.lld.hotel.domain.RoomTypeAvailability;
import com.striver.lld.hotel.domain.SearchFilter;
import com.striver.lld.hotel.service.SearchService;

import java.util.List;

public class SearchController {

    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    public List<Hotel> searchHotels(SearchFilter filter) {
        return searchService.searchHotels(filter);
    }

    public List<RoomTypeAvailability> getAvailability(String hotelId, DateRange range) {
        return searchService.getAvailability(hotelId, range);
    }
}

package com.striver.lld.hotel.repository;

import com.striver.lld.hotel.domain.SeasonalPrice;

import java.util.Optional;

public interface SeasonalPriceRepository {

    SeasonalPrice upsert(SeasonalPrice price);

    Optional<SeasonalPrice> findByKey(String hotelId, String roomTypeId, long dateUtc);
}

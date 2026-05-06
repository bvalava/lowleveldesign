package com.striver.lld.hotel.repository;

import com.striver.lld.hotel.domain.User;

import java.util.Optional;

public interface UserRepository {

    User save(User user);

    Optional<User> findById(String userId);
}

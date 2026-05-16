package com.striver.lld.digitalwallet.repository;

import com.striver.lld.digitalwallet.domain.User;

import java.util.Optional;

public interface UserRepository {

    User save(User user);
    Optional<User> findById(String userId);
}

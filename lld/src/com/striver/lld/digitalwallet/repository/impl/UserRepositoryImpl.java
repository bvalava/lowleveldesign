package com.striver.lld.digitalwallet.repository.impl;

import com.striver.lld.digitalwallet.domain.User;
import com.striver.lld.digitalwallet.repository.UserRepository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepositoryImpl implements UserRepository {

    private Map<String, User> users = new ConcurrentHashMap<>();

    @Override
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> findById(String userId) {
        return Optional.ofNullable(users.get(userId));
    }
}

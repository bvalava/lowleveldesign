package com.striver.lld.pubsub.repository;

import com.striver.lld.pubsub.domain.Subscriber;

import java.util.List;
import java.util.Optional;

public interface SubscriberRepository {

    Subscriber save(Subscriber subscriber);
    Optional<Subscriber> findById(String subscriberId);
    List<Subscriber> findAll();
    void updateOnlineStatus(String subscriberId, boolean isOnline, String connectionId);
    void deleteById(String subscriberId);
}

package com.striver.lld.pubsub.repository;

import com.striver.lld.pubsub.domain.Message;

import java.util.Optional;

public interface MessageRepository {

    Message save(Message message);
    Optional<Message> findById(String messageId);
    void deleteById(String messageId);
}

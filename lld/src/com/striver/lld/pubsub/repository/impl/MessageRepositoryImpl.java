package com.striver.lld.pubsub.repository.impl;

import com.striver.lld.pubsub.domain.Message;
import com.striver.lld.pubsub.repository.MessageRepository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class MessageRepositoryImpl implements MessageRepository {

    private Map<String, Message> messages = new ConcurrentHashMap<>();

    @Override
    public Message save(Message message) {
        messages.put(message.getId(), message);
        return message;
    }

    @Override
    public Optional<Message> findById(String messageId) {
        return Optional.ofNullable(messages.get(messageId));
    }

    @Override
    public void deleteById(String messageId) {
        messages.remove(messageId);
    }
}

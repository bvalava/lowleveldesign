package com.striver.lld.pubsub.domain.observer;

import com.striver.lld.pubsub.domain.Message;

public interface SubscriberObserver {

    void update(Message message);
}

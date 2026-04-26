package com.striver.lld.pubsub.controller;

import com.striver.lld.pubsub.domain.Subscription;
import com.striver.lld.pubsub.service.SubscriptionService;

public class SubscriptionController {

    private SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    public Subscription subscribeToTopic(String topicId, String subscriberId) {
        return subscriptionService.subscribeToTopic(topicId, subscriberId);
    }

    public void unsubscribeFromTopic(String topicId, String subscriberId) {
        subscriptionService.unsubscribeFromTopic(topicId, subscriberId);
    }
}

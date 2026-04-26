package com.striver.lld.pubsub.controller;

import com.striver.lld.pubsub.domain.Message;
import com.striver.lld.pubsub.service.PublisherService;

public class PublisherController {

    private PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public Message publishMessage(String topicId, String content) {
        return publisherService.publishMessage(topicId, content);
    }
}

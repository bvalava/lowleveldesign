package com.striver.lld.pubsub.controller;

import com.striver.lld.pubsub.service.MessageService;

public class MessageController {

    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void acknowledgeMessage(String messageId, String subscriberId) {
        messageService.acknowledgeMessage(messageId, subscriberId);
    }
}

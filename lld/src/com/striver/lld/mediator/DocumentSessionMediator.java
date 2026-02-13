package com.striver.lld.mediator;

public interface DocumentSessionMediator {

    void broadcastChange(String change, User sender);
    void join(User user);
}

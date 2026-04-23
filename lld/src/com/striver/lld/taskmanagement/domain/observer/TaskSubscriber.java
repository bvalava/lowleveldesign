package com.striver.lld.taskmanagement.domain.observer;

import com.striver.lld.taskmanagement.domain.ChangeType;

public interface TaskSubscriber {

    void update(int taskId, ChangeType changeType, String oldValue, String newValue);
}

package com.striver.lld.taskmanagement.domain.state;

import com.striver.lld.taskmanagement.domain.Task;
import com.striver.lld.taskmanagement.domain.TaskStatus;

public interface TaskState {

    boolean canTransitionTo(TaskStatus newStatus);
    void performTransition(Task task, TaskStatus newStatus);
    String getStateName();
}

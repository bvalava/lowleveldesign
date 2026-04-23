package com.striver.lld.taskmanagement.domain.state;

import com.striver.lld.taskmanagement.domain.Task;
import com.striver.lld.taskmanagement.domain.TaskStatus;
import com.striver.lld.taskmanagement.domain.observer.TaskSubscriber;

public class TodoState implements TaskState {

    @Override
    public boolean canTransitionTo(TaskStatus newStatus) {
        // TODO can transition to IN_PROGRESS or CANCELLED
        return newStatus == TaskStatus.IN_PROGRESS || newStatus == TaskStatus.CANCELLED;
    }

    @Override
    public void performTransition(Task task, TaskStatus newStatus) {
        if (canTransitionTo(newStatus)) {
            task.setStatus(newStatus);
            // TODO: Update state object based on new status
        } else {
            throw new InvalidStateTransitionException("Cannot transition from TODO to " + newStatus);
        }
    }

    @Override
    public String getStateName() {
        return "TODO";
    }
}

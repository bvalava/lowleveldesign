package com.striver.lld.taskmanagement.domain.state;

import com.striver.lld.taskmanagement.domain.Task;
import com.striver.lld.taskmanagement.domain.TaskStatus;

public class ReviewState implements TaskState{

    @Override
    public boolean canTransitionTo(TaskStatus newStatus) {
        // Can go to COMPLETED, IN_PROGRESS
        return newStatus == TaskStatus.COMPLETED || newStatus == TaskStatus.IN_PROGRESS;
    }

    @Override
    public void performTransition(Task task, TaskStatus newStatus) {
        if (canTransitionTo(newStatus)) {
            task.setStatus(newStatus);
        } else {
            throw new InvalidStateTransitionException(
                    "Cannot transition from REVIEW to " + newStatus);
        }
    }

    @Override
    public String getStateName() {
        return "REVIEW";
    }
}

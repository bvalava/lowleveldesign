package com.striver.lld.taskmanagement.repository;

import com.striver.lld.taskmanagement.domain.TaskSubscription;

import java.util.ArrayList;
import java.util.List;

public class TaskSubscriptionRepository {

    public TaskSubscription save(TaskSubscription subscription) {
        // TODO: Implement actual database save
        System.out.println("Saving subscription: User " + subscription.getUserId() + " -> Task " + subscription.getTaskId());
        return subscription;
    }

    public List<TaskSubscription> findByTaskId(int taskId) {
        // TODO: Implement actual database query
        System.out.println("Finding subscriptions for task: " + taskId);
        return new ArrayList<>();
    }

    public List<TaskSubscription> findByUserId(int userId) {
        // TODO: Implement actual database query
        System.out.println("Finding subscriptions for user: " + userId);
        return new ArrayList<>();
    }
}

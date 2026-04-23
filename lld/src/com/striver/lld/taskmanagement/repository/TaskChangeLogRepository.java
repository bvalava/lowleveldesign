package com.striver.lld.taskmanagement.repository;

import com.striver.lld.taskmanagement.domain.TaskChangeLog;

import java.util.ArrayList;
import java.util.List;

public class TaskChangeLogRepository {

    public TaskChangeLog save(TaskChangeLog log) {
        // TODO: Implement actual database save
        System.out.println("Saving task change log: " + log.getChangeType() + " for task " + log.getTaskId());
        return log;
    }

    public List<TaskChangeLog> findByTaskId(int taskId) {
        // TODO: Implement actual database query
        System.out.println("Finding change logs for task: " + taskId);
        return new ArrayList<>();
    }
}

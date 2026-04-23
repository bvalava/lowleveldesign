package com.striver.lld.taskmanagement.controller;

import com.striver.lld.taskmanagement.domain.TaskStatus;
import com.striver.lld.taskmanagement.service.TaskStateService;

public class TaskStateController {

    private TaskStateService taskStateService;

    public TaskStateController(TaskStateService taskStateService) {
        this.taskStateService = taskStateService;
    }

    public void updateTaskStatus(int taskId, TaskStatus newStatus) {
        taskStateService.updateTaskStatus(taskId, newStatus);
    }
}

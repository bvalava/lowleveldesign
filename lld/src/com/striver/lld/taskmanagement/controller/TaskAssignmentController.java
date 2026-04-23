package com.striver.lld.taskmanagement.controller;

import com.striver.lld.taskmanagement.service.TaskAssignmentService;

public class TaskAssignmentController {

    private TaskAssignmentService taskAssignmentService;

    public TaskAssignmentController(TaskAssignmentService taskAssignmentService) {
        this.taskAssignmentService = taskAssignmentService;
    }

    public void assignTask(int taskId, int assigneeId) {
        taskAssignmentService.assignTask(taskId, assigneeId);
    }
}

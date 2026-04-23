package com.striver.lld.taskmanagement.repository;

import com.striver.lld.taskmanagement.domain.Task;
import com.striver.lld.taskmanagement.domain.TaskSearchCriteria;

import java.util.List;

public interface TaskRepository {

    Task save(Task task);
    Task findById(int taskId);
    List<Task> findByAssignee(int assigneeId);
    List<Task> findByParentTask(int parentTaskId);
    List<Task> search(TaskSearchCriteria criteria);
    void delete(int taskId);
}

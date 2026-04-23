package com.striver.lld.taskmanagement.domain.strategy;

import com.striver.lld.taskmanagement.domain.Task;

import java.util.List;

public interface TaskSortingStrategy {

    List<Task> sort(List<Task> tasks);
    String getStrategyName();
}
